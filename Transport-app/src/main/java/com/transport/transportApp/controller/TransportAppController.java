package com.transport.transportApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transport.transportApp.service.TransportService;

@RestController
@RequestMapping("/api")
public class TransportAppController {
	
	@Autowired
	TransportService transportService;
	
	public ResponseEntity<Object> getAddress(){
		
	}

}
