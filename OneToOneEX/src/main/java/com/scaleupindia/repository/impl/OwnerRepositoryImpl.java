package com.scaleupindia.repository.impl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.scaleupindia.config.DatabaseConfig;
import com.scaleupindia.owner.Owner;
import com.scaleupindia.owner.Pet;
import com.scaleupindia.repository.OwnerRepository;


public class OwnerRepositoryImpl implements OwnerRepository {

	private final SessionFactory sessionFactory = DatabaseConfig.buildSessionFactory();
	

	@Override
	public void saveOwner(Owner owner) {
		try(Session session = sessionFactory.openSession();){
			Transaction transaction = session.beginTransaction();
			session.persist(owner);
			transaction.commit();
		}
	}

	@Override
	public Owner findOwner(int ownerId) {
		try(Session session = sessionFactory.openSession();){
			return session.get(Owner.class , ownerId);
		}
	}

	@Override
	public void updatePetDetails(int ownerId, String petName) {
		try(Session session = sessionFactory.openSession();){
			Transaction transaction = session.beginTransaction();
			var owner = session.get(Owner.class, ownerId);
			Pet pet = owner.getpet();
			pet.setPetName(petName);
			owner.setpet(pet);
			// owner.getpet().setPetName(petName);
			session.merge(owner);
			transaction.commit();
		}
	}

	@Override
	public void deleteOwner(int ownerId) {
		try(Session session = sessionFactory.openSession();){
			Transaction transaction = session.beginTransaction();
			var owner = session.get(Owner.class , ownerId);
			session.remove(owner);
			transaction.commit();
		}
	}

}
