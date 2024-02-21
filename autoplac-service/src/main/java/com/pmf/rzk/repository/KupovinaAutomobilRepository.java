package com.pmf.rzk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pmf.rzk.model.Kupovina;
import com.pmf.rzk.model.Kupovinaautomobil;

public interface KupovinaAutomobilRepository extends JpaRepository<Kupovinaautomobil, Integer>{
	List<Kupovinaautomobil> findByKupovina(Kupovina k);
}
