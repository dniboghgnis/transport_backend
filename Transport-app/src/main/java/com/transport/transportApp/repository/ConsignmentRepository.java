package com.transport.transportApp.repository;


import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.transport.transportApp.model.Consignment;

@Repository
public interface ConsignmentRepository extends ExtendedRepository<Consignment, Integer>{

	
	//@Query(value = "SELECT a FROM Consignment a WHERE truckInfo = ?1")
	//ArrayList<Consignment> findByTruckInfo(String truckInfo);

}
