package com.example.demo.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TransactionService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TransactionController {
	
	@Autowired
	TransactionService service;
	
	@GetMapping("/RTA/{collectionId}")
	public String getRTAresponse(@PathVariable String collectionId) {
		System.out.println("1");
		return service.generateResponse(collectionId).toString();
	}
	
	
}
