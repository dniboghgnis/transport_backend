package com.transport.transportApp.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transport.transportApp.model.Address;
import com.transport.transportApp.repository.AddressRepository;

@Service
public class TransportService {
	
	@Autowired
	public final AddressRepository repository;
	
	
	TransportService(AddressRepository repository){
		this.repository = repository;
	}
	
	
	//Adding a new address
	public void addAddress(Address address) {
		repository.save(address);
	}
	
	//deleting an address
	public void deleteAddress(int id, Address address) {
		repository.deleteById(id);
		
	}
	

}
