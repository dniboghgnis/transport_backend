package com.transport.transportApp.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ExtendedRepository <T, ID extends Serializable> extends JpaRepository<T, ID>  {

	public static final Integer BATCH_SIZE = 30;

    void batchPersist(List<T> entityList);

    void batchUpdate(List<T> entityList); 
}
