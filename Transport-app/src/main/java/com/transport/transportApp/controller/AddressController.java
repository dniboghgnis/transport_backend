package com.transport.transportApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transport.transportApp.service.AddressService;
import com.transport.transportApp.model.*;

import java.util.*;

@RestController
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	
	@GetMapping("/address/get")
	public List<Address> getAddress(){
		try {
		 return addressService.getAddress();
		
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	

}
