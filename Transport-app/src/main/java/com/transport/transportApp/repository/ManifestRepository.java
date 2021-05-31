package com.transport.transportApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.transport.transportApp.model.Manifest;

@Repository
public interface ManifestRepository extends CrudRepository<Manifest, Integer> {

}
