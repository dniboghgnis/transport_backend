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
	
	public List<Address> getAllAddress(){
		return addressRepository.findAll();
	}
	
	public Optional<Address> getAddress(int addressId) {
		Optional<Address> address =  addressRepository.findById(addressId);
		if(!address.isPresent()) {
			throw new AddressNotFoundException(addressId);
		}else {
			return address;
		}
			
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
