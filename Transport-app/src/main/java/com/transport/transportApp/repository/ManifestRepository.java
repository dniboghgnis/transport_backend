package com.transport.transportApp.repository;


import org.springframework.stereotype.Repository;

import com.transport.transportApp.model.Manifest;

@Repository
public interface ManifestRepository extends ExtendedRepository<Manifest, Integer> {

}
