package com.helloworld.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping(value = "/hello")
	public ResponseEntity<String> helloWorld() {
		System.out.println("Hello World");
		return new ResponseEntity<String>("Hello World", HttpStatus.OK);
	}

}
