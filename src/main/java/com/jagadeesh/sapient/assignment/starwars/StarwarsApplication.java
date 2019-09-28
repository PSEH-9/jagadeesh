package com.jagadeesh.sapient.assignment.starwars;

import com.jagadeesh.sapient.assignment.starwars.services.StarWarServiceImpl;
import com.jagadeesh.sapient.assignment.starwars.services.StarsWarsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class StarwarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarwarsApplication.class, args);
	}

	@Bean
	public StarsWarsService getStarWarService(){
		return new StarWarServiceImpl();
	}
}
