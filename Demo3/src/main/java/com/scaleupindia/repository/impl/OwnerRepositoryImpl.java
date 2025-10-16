package com.scaleupindia.repository.impl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.scaleupindia.config.DatabaseConfig;
import com.scaleupindia.owner.CompositePrimaryKey;
import com.scaleupindia.owner.Owner;
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
	public Owner findOwner(CompositePrimaryKey primaryKey) {
		try(Session session = sessionFactory.openSession();){
			return session.get(Owner.class , primaryKey);
		}
	}

	@Override
	public void updatePetDetails(CompositePrimaryKey primaryKey, String petName) {
		try(Session session = sessionFactory.openSession();){
			Transaction transaction = session.beginTransaction();
			var owner = session.get(Owner.class, primaryKey);
			owner.setPetName(petName);
			session.merge(owner);
			transaction.commit();
		}
	}

	@Override
	public void deleteOwner(CompositePrimaryKey primaryKey) {
		try(Session session = sessionFactory.openSession();){
			Transaction transaction = session.beginTransaction();
			var owner = session.get(Owner.class , primaryKey);
			session.remove(owner);
			transaction.commit();
		}
	}

}
