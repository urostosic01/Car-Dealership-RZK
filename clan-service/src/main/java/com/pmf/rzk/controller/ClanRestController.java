package com.pmf.rzk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pmf.rzk.model.Clan;
import com.pmf.rzk.service.ClanService;

import jakarta.validation.Valid;

@RestController
public class ClanRestController {

	@Autowired
	ClanService clanService;
	
	@GetMapping("/login/{username}/{password}")
	public boolean login(@PathVariable String username, @PathVariable String password) {
		return clanService.login(username, password);
	}
	
	@PostMapping("/register/{idRole}")
	public boolean register(@PathVariable Integer idRole, @Valid @RequestBody Clan c) {
		return clanService.registracija(idRole, c);
	}
}
