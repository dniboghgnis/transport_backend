package com.transport.transportApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transport.transportApp.service.AddressService;
import com.transport.transportApp.model.*;

import java.util.*;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	
	@GetMapping("/find/all")
	public List<Address> getAddress(){
		try {
		 return addressService.getAllAddress();
		
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	
	

}
