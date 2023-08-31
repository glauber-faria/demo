package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CalculadoraService;

@RestController
public class CalculadoraController {
	@Autowired
	private CalculadoraService service;
	
	@GetMapping("/soma/{a}/{b}")
	public ResponseEntity<?> soma(@PathVariable() int a,@PathVariable() int b){
		return ResponseEntity.ok(service.somar(a, b));
	}

}
