package com.pmf.rzk.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pmf.rzk.beans.BankovniRacun;

@FeignClient(name = "banka-service")// url = "localhost:8002")
public interface BankaProxy {

	@PostMapping("/create-account/{idUser}")
	public BankovniRacun createBankAccount(@PathVariable Integer idUser, @RequestBody BankovniRacun r); 
	
	@GetMapping("/check-balance/{idUser}/{idAccount}")
	public int checkBalance(@PathVariable Integer idUser, @PathVariable Integer idAccount);
	
	@GetMapping("/check-balance-account/{idAccount}")
	public int checkBalanceAccount(@PathVariable Integer idAccount);
	
	@PutMapping("/update-balance/{kolicina}/{idAccount}")
	public int updateBalance(@PathVariable Integer kolicina, @PathVariable Integer idAccount); 
}
