package com.scaleupindia.config;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistry;

import com.scaleupindia.owner.Owner;


public class DatabaseConfig {

	private final static SessionFactory SESSION_FACTORY = buildSessionFactory();

	private DatabaseConfig() {
		
	}

	public static SessionFactory buildSessionFactory(){
		Configuration configuration = new Configuration()
						.addAnnotatedClass(Owner.class);
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();
		return configuration.buildSessionFactory(serviceRegistry);
	}

	public static SessionFactory getSessionFactory(){
		return SESSION_FACTORY;
	}

}