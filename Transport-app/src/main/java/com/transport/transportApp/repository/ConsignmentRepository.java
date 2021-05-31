package com.transport.transportApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.transport.transportApp.model.Consignment;

@Repository
public interface ConsignmentRepository extends CrudRepository<Consignment, Integer>{

}