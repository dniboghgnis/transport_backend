package com.transport.transportApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.transport.transportApp.model.LorryChalan;

@Repository
public interface LorryChalanRepository extends CrudRepository<LorryChalan, Integer> {

}
