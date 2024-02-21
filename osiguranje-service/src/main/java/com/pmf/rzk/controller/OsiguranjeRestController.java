package com.pmf.rzk.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pmf.rzk.model.Osiguranje;
import com.pmf.rzk.service.OsiguranjeService;

import jakarta.validation.Valid;

@RestController
@Validated
public class OsiguranjeRestController {

	@Autowired
	OsiguranjeService osiguranjeService;
	
	@GetMapping("/get-insurance/{idUser}")
	public List<Osiguranje> getInsurance(@PathVariable Integer idUser) {
		return osiguranjeService.vratiSpisakOsiguranja(idUser);
	}
	
	@PostMapping("/add-insurance/{idUser}/{idCarPurchase}/{yearLength}")
	public Osiguranje addInsurance( @PathVariable Integer idUser, 
									@PathVariable Integer idCarPurchase, 
									@PathVariable Integer yearLength,
									@Valid @RequestBody Osiguranje o) {
		
		return osiguranjeService.dodajOsiguranjeKupljenomAutu(idUser, idCarPurchase, yearLength, o);
	}
}