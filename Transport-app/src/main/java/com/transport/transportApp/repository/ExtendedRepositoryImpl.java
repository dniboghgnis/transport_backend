package com.transport.transportApp.repository;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

public class ExtendedRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID>
		implements ExtendedRepository<T, ID> {

	private static final Logger LOGGER = LoggerFactory.getLogger(ExtendedRepositoryImpl.class);

	private EntityManager entityManager;

	public ExtendedRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);
		this.entityManager = entityManager;
	}

	@Transactional
	public void batchPersist(List<T> entityList) {
		int i = 0;
		for (T entity : entityList) {
			if (i > 0 && i % BATCH_SIZE == 0) {
				entityManager.flush();
				entityManager.clear();
			}
			entityManager.persist(entity);
			++i;
		}
		entityManager.flush();
		entityManager.clear();
		LOGGER.info("batch insert completed");
	}

	@Transactional
	public void batchUpdate(List<T> entityList) {
		int i = 0;
		Session session = entityManager.unwrap(Session.class);
		for (T entity : entityList) {
			if (i > 0 && i % BATCH_SIZE == 0) {
				entityManager.flush();
				entityManager.clear();
			}	session.update(entity);
			++i;
		}
		entityManager.flush();
		entityManager.clear();
		LOGGER.info("batch update completed");
	}

}
