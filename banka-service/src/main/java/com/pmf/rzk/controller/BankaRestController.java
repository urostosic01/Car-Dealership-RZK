package com.pmf.rzk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pmf.rzk.model.BankovniRacun;
import com.pmf.rzk.service.BankaService;

import jakarta.validation.Valid;
import jakarta.ws.rs.Path;

@RestController
@Validated
public class BankaRestController {

	@Autowired
	BankaService bankaService;
	
	@PostMapping("/create-account/{idUser}")
	public BankovniRacun createBankAccount(@PathVariable Integer idUser, @Valid @RequestBody BankovniRacun r) {
		return bankaService.kreirajRacun(idUser, r);
	}
	
	@GetMapping("/check-balance/{idUser}/{idAccount}")
	public int checkBalance(@PathVariable Integer idUser, @PathVariable Integer idAccount) {
		return bankaService.proveriStanje(idUser, idAccount);
	}
	
	@GetMapping("/check-balance-account/{idAccount}")
	public int checkBalanceAccount(@PathVariable Integer idAccount) {
		return bankaService.proveriStanjePoRacunu(idAccount);
	}
	
	@PutMapping("/update-balance/{kolicina}/{idAccount}")
	public int updateBalance(@PathVariable Integer kolicina, @PathVariable Integer idAccount) {
		return bankaService.azurirajStanje(kolicina, idAccount);
	}
	
}
