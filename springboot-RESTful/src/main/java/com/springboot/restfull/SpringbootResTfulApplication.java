package com.springboot.restfull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.springboot.entity"})  // scan JPA entities
public class SpringbootResTfulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootResTfulApplication.class, args);
	}

}
