package com.transport.transportApp.repository;


import org.springframework.stereotype.Repository;

import com.transport.transportApp.model.Bill;

@Repository
public interface BillRepository extends ExtendedRepository<Bill, Integer> {

}
