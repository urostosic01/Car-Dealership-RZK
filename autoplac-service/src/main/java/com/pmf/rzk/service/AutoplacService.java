package com.pmf.rzk.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmf.rzk.exception.ModelNijePronadjenError;
import com.pmf.rzk.exception.ProizvodjacNijePronadjenError;
import com.pmf.rzk.model.Automobil;
import com.pmf.rzk.model.Clan;
import com.pmf.rzk.model.Clanuloga;
import com.pmf.rzk.model.Kupovina;
import com.pmf.rzk.model.Kupovinaautomobil;
import com.pmf.rzk.model.Model;
import com.pmf.rzk.model.Proizvodjac;
import com.pmf.rzk.repository.AutomobilRepository;
import com.pmf.rzk.repository.ClanRepository;
import com.pmf.rzk.repository.KupovinaAutomobilRepository;
import com.pmf.rzk.repository.KupovinaRepository;
import com.pmf.rzk.repository.ModelRepository;
import com.pmf.rzk.repository.ProizvodjacRepository;

@Service
public class AutoplacService {

	@Autowired
	ProizvodjacRepository proizvodjacRepo;

	@Autowired
	ModelRepository modelRepo;

	@Autowired
	AutomobilRepository automobilRepo;

	@Autowired
	ClanRepository clanRepo;
	
	@Autowired
	KupovinaRepository kupovinaRepo;
	
	@Autowired
	KupovinaAutomobilRepository kupovinaAutoRepo;

	public List<Proizvodjac> vratiProizvodjace() {
		return proizvodjacRepo.findAll();
	}

	public List<Model> vratiModele(Integer idManufacturer) {
		Optional<Proizvodjac> trazeni = proizvodjacRepo.findById(idManufacturer);
		if (trazeni.isEmpty()) {
			System.out.println("Nepostojeci proizvodjac");
			throw new ProizvodjacNijePronadjenError("Proizvodjac nije pronadjen! ", idManufacturer.toString());
		}
		return modelRepo.findByProizvodjac(trazeni.get());
	}

	public List<Automobil> vratiAutomobile() {
		List<Automobil> listaSvihAutomobila = automobilRepo.findAll();
		return listaSvihAutomobila;
	}

	public boolean dodajAutomobil(Integer idUser, Integer idModel, Automobil a) {
		Optional<Clan> proveraClana = clanRepo.findById(idUser);
		Clan admin = null;
		if (proveraClana.isPresent()) {
			for (Clanuloga u : proveraClana.get().getClanulogas()) {
				if (u.getUloga().getIdUloga() == 1 || u.getUloga().getIdUloga() == 2) {
					admin = proveraClana.get();
				}
			}
		}
		if (admin != null) {
			Optional<Model> trazeniModel = modelRepo.findById(idModel);
			if (trazeniModel.isPresent()) {
				a.setModel(trazeniModel.get());
				automobilRepo.save(a);
				return true;
			}
			else {
				throw new ModelNijePronadjenError("Model nije pronadjen!", idModel.toString());
			}
		}
		else {
			System.out.println("Korisnik nije admin!");
			return false;
		}
		
	}

	
	
	public Kupovinaautomobil dodajAutomobilUKupovinu(Integer idCar, Integer idPurchase, Kupovinaautomobil k) {
		Optional<Automobil> trazeniAutomobil = automobilRepo.findById(idCar);
		Optional<Kupovina> trazenaKupovina = kupovinaRepo.findById(idPurchase);
		Kupovinaautomobil novi = null;
		if(trazeniAutomobil.isPresent() && trazenaKupovina.isPresent()) {
			k.setAutomobil(trazeniAutomobil.get());
			k.setKupovina(trazenaKupovina.get());
			novi = kupovinaAutoRepo.save(k);
		}
		return novi;
	}

	public Kupovina dodajKupovinu(Integer idUser, Kupovina k) {
		Optional<Clan> trazeniClan = clanRepo.findById(idUser);
		if(trazeniClan.isPresent()) {
			k.setClan(trazeniClan.get());
			k.setDatumKupovine(new Date());
			return kupovinaRepo.save(k);
		}
		return null;		
	}

	public Kupovina vratiKupovinu(Integer idPurchase) {
		Optional<Kupovina> trazena = kupovinaRepo.findById(idPurchase);
		if(trazena.isPresent())
			return trazena.get();
		return null;
	}

	public List<Kupovinaautomobil> vratiKupovinaAuto(Integer idPurchase) {
		Kupovina trazenaKupovina = vratiKupovinu(idPurchase);
		List<Kupovinaautomobil> spisakAutomobila = null;
		if(trazenaKupovina != null) {
			spisakAutomobila = kupovinaAutoRepo.findByKupovina(trazenaKupovina);
		}
		
		return spisakAutomobila;
	}


}
