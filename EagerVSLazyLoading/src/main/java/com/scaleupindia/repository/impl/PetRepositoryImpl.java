package com.scaleupindia.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.scaleupindia.config.DatabaseConfig;
import com.scaleupindia.entity.Pet;
import com.scaleupindia.repository.PetRepository;


public class PetRepositoryImpl implements PetRepository {
	private SessionFactory sessionFactory = DatabaseConfig.getSessionFactory();

	@Override
	public Pet findPet(int petId) {
		try (Session session = sessionFactory.openSession()) {
			return session.get(Pet.class, petId);
		}
	}

}
