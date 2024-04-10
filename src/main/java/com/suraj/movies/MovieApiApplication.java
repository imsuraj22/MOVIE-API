package com.suraj.movies;

import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// @EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
@RestController
// @ComponentScan(basePackages = "com.suraj.movies")
public class MovieApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieApiApplication.class, args);
	}
	
	@GetMapping("/mypoint")
	public String name() {
		return "Hello im suraj Gaikwad!";
	}

}
