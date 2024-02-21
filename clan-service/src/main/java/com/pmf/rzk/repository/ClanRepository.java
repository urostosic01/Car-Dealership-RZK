package com.pmf.rzk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pmf.rzk.model.Clan;

public interface ClanRepository extends JpaRepository<Clan, Integer>{
	Clan findByKorisnickoImeAndSifra(String korisnickoIme, String sifra);
	Clan findByKorisnickoIme(String korisnickoIme);
	
}
