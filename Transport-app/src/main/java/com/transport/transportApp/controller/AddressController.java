package com.transport.transportApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RestController;

import com.transport.transportApp.service.AddressService;
import com.transport.transportApp.model.*;


import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@GetMapping("/address")
	public List<Address> getAllAddress(){
		return addressService.getAllAddress();
	}
	
	@PostMapping(value = "/addAddress")
	public Address addAddress(@RequestBody Address address) {
		System.out.println("New address added" + address);
		 return addressService.addAddress(address);
		 
		 }
	
	@RequestMapping("/welcome")
	public String welcomepage() {
		return "Welcome to TransportManagementApp";
	}
	
	@GetMapping("/address/{id}")
	public ResponseEntity<Optional<Address>> getAddressById(@PathVariable int id){
		return ResponseEntity.ok().body(addressService.getAddress(id));
	}
	
	@PutMapping("/updateAddress/{id}")
	public ResponseEntity<Address> updateAddress(@RequestBody Address address, @PathVariable int id){
		return ResponseEntity.ok().body(addressService.updateAddress(id, address));
	}
	
	@DeleteMapping("/deleteAddress/{id}")
	public String deleteAddress(@PathVariable int id) {
		
		addressService.deleteAddress(id);
		return "Address deleted";
	}
	
}
