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
	
	public List<Address> getAllAddress(){
		return addressRepository.findAll();
	}
	
	public Address findById(int addressId) {
		Optional<Address> address =  addressRepository.findById(addressId);
		Address getAddress = address.get();
		return getAddress;
		
	}
	
	public Address addAddress(Address address) {
		return addressRepository.save(address);
	}
	
	public void updateAddress(int addressId) {
	
	}
	
	public void deleteAddress(Address address) {
		addressRepository.delete(address);
	}

}
