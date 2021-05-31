package com.transport.transportApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.transport.transportApp.model.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer>{

}
