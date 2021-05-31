package com.transport.transportApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.transport.transportApp.model.Consigner;

@Repository
public interface ConsignerRepository extends CrudRepository<Consigner, Integer>{

}
