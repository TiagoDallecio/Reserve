package com.reservance.reservance.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CORSconfig {
	
	    @Bean
	    public CorsFilter corsFilter() {
	        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	        CorsConfiguration config = new CorsConfiguration();

	        config.addAllowedOrigin("*");

	        config.addAllowedMethod("*");

	        config.addAllowedHeader("*");

	        source.registerCorsConfiguration("/**", config);

	        return new CorsFilter(source);
	    }
	}


