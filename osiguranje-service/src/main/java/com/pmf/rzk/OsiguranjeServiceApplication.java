package com.pmf.rzk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.pmf.rzk.model")
public class OsiguranjeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OsiguranjeServiceApplication.class, args);
	}

}
