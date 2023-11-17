package com.juliuskanani.movieapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController // framework know this class is actually a REST API Controller class
public class MovieApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieApiApplication.class, args);
	}

	//@GetMapping("/root") // This annotation lets the framework know this is a GET endpoint.
	public String apiRoot() {
		return "Hello World!";
	}

	// Divide application to layers
	// Service, Data Access Layer, and an API Layer.

}
