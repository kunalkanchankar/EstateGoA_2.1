package com.example.realestatego;


import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
//@CrossOrigin(origins = "http://localhost:4200")
public class EstateGoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstateGoApplication.class, args);
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
	
//	@Bean
//	public CorsFilter corsFilter() {
//	    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//	    CorsConfiguration config = new CorsConfiguration();
//	    config.setAllowCredentials(true);
//	    config.addAllowedOrigin("http://localhost:4200");
//	    config.addAllowedHeader("*");
//	    config.addAllowedMethod("*");
//	    source.registerCorsConfiguration("/**", config);
//	    return new CorsFilter(source);
//	}

}
