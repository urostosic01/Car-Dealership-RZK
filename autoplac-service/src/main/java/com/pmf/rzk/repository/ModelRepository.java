package com.pmf.rzk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pmf.rzk.model.Model;
import com.pmf.rzk.model.Proizvodjac;

public interface ModelRepository extends JpaRepository<Model, Integer>{
	public List<Model> findByProizvodjac(Proizvodjac p);
}
