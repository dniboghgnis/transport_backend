package com.transport.transportApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.transport.transportApp.model.Bill;

@Repository
public interface BillRepository extends CrudRepository<Bill, Integer> {

}
