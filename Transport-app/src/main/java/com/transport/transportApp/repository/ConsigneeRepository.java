package com.transport.transportApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.transport.transportApp.model.Consignee;

@Repository
public interface ConsigneeRepository extends CrudRepository<Consignee, Integer>{

}
