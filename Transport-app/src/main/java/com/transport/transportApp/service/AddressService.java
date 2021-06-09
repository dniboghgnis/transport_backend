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
		return addressRepository.getOne(addressId);
	}
	
	public Address addAddress(Address address) {
		Address newAddress = addressRepository.save(address);
		return newAddress;
	}
	
	public void updateAddress(Address address) {
		addressRepository.save(address);
	}
	
	public void deleteAddress(int addressId) {
		addressRepository.deleteById(addressId);
	}

}
