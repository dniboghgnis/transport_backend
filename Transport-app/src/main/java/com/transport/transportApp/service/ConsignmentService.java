package com.transport.transportApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transport.transportApp.repository.ConsignmentRepository;
import com.transport.transportApp.exceptionHandling.ConsignmentNotFoundException;
import com.transport.transportApp.model.*;
import java.util.List;
import java.util.Optional;

@Service
public class ConsignmentService {
	
	@Autowired
	private ConsignmentRepository consignmentRepository;
	
	public List<Consignment> getAllConsignment(){
		return consignmentRepository.findAll();
	}
	
	public Consignment createConsignment(Consignment consignment) {
		return consignmentRepository.save(consignment);
	}
	
	/***Method to get the Consignment by ID***/
	public Optional<Consignment> getConsignmentById(int consignmentId) {
		
		Optional<Consignment> consignment = consignmentRepository.findById(consignmentId);
		if(!consignment.isPresent()) {
			throw new ConsignmentNotFoundException(consignmentId);
		}else
			return consignment;
	}

}