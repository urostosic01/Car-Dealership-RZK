package com.pmf.rzk.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {

	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes()
						.route(p -> p.path("/**").uri("lb://autoplac-radnja-service"))
//						.route(p -> p.path("/buy-cars/**").filters(f->f.rewritePath("/buy-cars", "/kupovina-vozila")).uri("lb://autoplac-radnja-service"))
						.build();
	}
}
