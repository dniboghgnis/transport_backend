package com.transport.transportApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transport.transportApp.repository.AddressRepository;
import java.util.*;

import com.transport.transportApp.exceptionHandling.*;
import com.transport.transportApp.model.*;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	/***Method to get all the address***/
	public List<Address> getAllAddress(){
		return addressRepository.findAll();
	}
	
	/***Method to get the address by ID***/
	public Optional<Address> getAddress(int addressId) {
		Optional<Address> address =  addressRepository.findById(addressId);
		if(!address.isPresent()) {
			throw new AddressNotFoundException(addressId);
		}else {
			return address;
		}
			
	}
	
	
	/***Adding a new address***/
	public Address addAddress(Address address) {
		return addressRepository.save(address);
	}
	
	/***Update an address for a given addressID***/
	public Address updateAddress(int addressId, Address address) {
		
		Optional<Address> addressOptional = addressRepository.findById(addressId);
		
		if(!addressOptional.isPresent()) {
			throw new AddressNotFoundException(addressId);
		}else {
			return addressRepository.save(address);
		}
	}
	
	
	
	/***Delete an address for a given addressID***/
	public void deleteAddress(int addressId) {
		
		Optional<Address> addressOptional = addressRepository.findById(addressId);
		if(!addressOptional.isPresent()) {
			throw new AddressNotFoundException(addressId);
		}else {
			addressRepository.deleteById(addressId);
		}
	}

}
