package com.transport.transportApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transport.transportApp.service.AddressService;
import com.transport.transportApp.model.*;

import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	
	@GetMapping("/address")
	public List<Address> getAllAddress(){
		try {
		 return addressService.getAllAddress();
		
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	@GetMapping("/address/{id}")
	public Address getAddress(@PathVariable int id) {
		Address address = addressService.findById(id);
		return address;
	}
	
	@DeleteMapping(path = "/address/{id}")
	public String deleteAddress(@PathVariable int id) {
		 addressService.deleteAddress(id);
		return "user deleted sucessfully";
	}
	
	@PostMapping("/address")
	public Address createAddress(@RequestBody Address address){
		Address savedAddress = addressService.addAddress(address);
		return savedAddress;
	}

}
