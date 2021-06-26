package com.transport.transportApp.repository;


import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.transport.transportApp.model.Consignment;

@Repository
public interface ConsignmentRepository extends ExtendedRepository<Consignment, Integer>{

	/**
	@Query(value = "SELECT * FROM Consignment a WHERE truckInfo = ?1", nativeQuery = true)
	ArrayList<Consignment> findByTruckInfo(String truckInfo);
	
	@Query(value = "SELECT * FROM Consignment WHERE deliveryStatus =1?" , nativeQuery = true)
	ArrayList<Consignment> findByDeliveryStatus(String deliveryStatus);
	**/

}
