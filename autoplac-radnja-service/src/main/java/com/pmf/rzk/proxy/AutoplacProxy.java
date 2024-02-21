package com.pmf.rzk.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pmf.rzk.beans.Automobil;
import com.pmf.rzk.beans.Kupovina;
import com.pmf.rzk.beans.KupovinaAutomobil;
import com.pmf.rzk.beans.Model;
import com.pmf.rzk.beans.Proizvodjac;

@FeignClient(name = "autoplac-service") //, url = "localhost:8000")
public interface AutoplacProxy {

	@GetMapping("/get-manufacturers")
	public List<Proizvodjac> getManufacturers();
	
	@GetMapping("/get-models/{idManufacturer}")
	public List<Model> getModels(@PathVariable Integer idManufacturer);
	
	@GetMapping("/get-purchase/{idPurchase}")
	public Kupovina getPurchase(@PathVariable Integer idPurchase);
	
	@GetMapping("/get-purchase-car/{idPurchase}") 
	public List<KupovinaAutomobil> getPurchaseCar(@PathVariable Integer idPurchase);
	
	@GetMapping("/get-cars")
	public List<Automobil> getCars();
	
	@PostMapping("/add-car/{idUser}/{idModel}")  
	public boolean addCar(@PathVariable Integer idUser, @PathVariable Integer idModel, @RequestBody Automobil a);
	
	@PostMapping("/add-purchase/{idUser}")
	public Kupovina addPurchase(@PathVariable Integer idUser, @RequestBody Kupovina k);
	
	@PostMapping("/add-car-purchase/{idCar}/{idPurchase}")//ako ne radi promeniti nazad u mala slova Kupovinaautomobil
	public KupovinaAutomobil addCarPurchase (@PathVariable Integer idCar, @PathVariable Integer idPurchase,@RequestBody KupovinaAutomobil k);
	
}
