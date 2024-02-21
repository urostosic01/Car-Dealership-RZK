package com.pmf.rzk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pmf.rzk.model.Clan;
import com.pmf.rzk.model.Osiguranje;

public interface OsiguranjeRepository extends JpaRepository<Osiguranje, Integer>{
	public List<Osiguranje> findByClan(Clan c);
}
