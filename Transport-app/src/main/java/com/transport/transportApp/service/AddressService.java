package com.transport.transportApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transport.transportApp.repository.AddressRepository;
import java.util.*;
import com.transport.transportApp.model.*;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	public List<Address> getAddress(){
		return addressRepository.findAll();
	}

}
