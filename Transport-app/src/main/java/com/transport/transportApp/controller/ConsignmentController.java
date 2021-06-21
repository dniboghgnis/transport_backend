package com.transport.transportApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.transport.transportApp.service.ConsignmentService;
import com.transport.transportApp.model.*;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ConsignmentController {
	
	@Autowired
	private ConsignmentService consignmentService;
	
	@GetMapping("/consignment")
	public List<Consignment> getAllConsignment(){
		
		return consignmentService.getAllConsignment();
		
	}
	
	@PostMapping("/consignment")
	public Consignment addConsignment(@RequestBody Consignment consignment) {
		return consignmentService.createConsignment(consignment);
	}
	
	@GetMapping("/consignment/{id}")
	public ResponseEntity<Optional<Consignment>> getConsignmentById(@PathVariable int id){
		return ResponseEntity.ok().body(consignmentService.getConsignmentById(id));
	}
	

}
