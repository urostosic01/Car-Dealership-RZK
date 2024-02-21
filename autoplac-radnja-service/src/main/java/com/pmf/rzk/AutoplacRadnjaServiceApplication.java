package com.pmf.rzk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AutoplacRadnjaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoplacRadnjaServiceApplication.class, args);
	}

}
