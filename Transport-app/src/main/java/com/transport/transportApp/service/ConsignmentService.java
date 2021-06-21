package com.transport.transportApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transport.transportApp.repository.ConsignmentRepository;
import com.transport.transportApp.model.*;
import java.util.List;

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

}
