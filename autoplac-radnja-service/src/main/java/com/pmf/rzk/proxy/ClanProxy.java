package com.pmf.rzk.proxy;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pmf.rzk.beans.Clan;

@FeignClient(name = "clan-service")//, url = "localhost:8001")
public interface ClanProxy {
	
	@GetMapping("/login/{username}/{password}")
	public boolean login(@PathVariable String username, @PathVariable String password); 
	
	@PostMapping("/register/{idRole}")
	public boolean register(@PathVariable Integer idRole, @RequestBody Clan c);
	
}
