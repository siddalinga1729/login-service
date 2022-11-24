package com.springbootmicroservicehello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class SpringBootMicroserviceHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceHelloApplication.class, args);
	}
	
	@GetMapping("/hello/{name}")
	public ResponseEntity<String> hello(@PathVariable String name) {
		return new ResponseEntity<String>("Hello, " + name, HttpStatus.OK);
	}

}
