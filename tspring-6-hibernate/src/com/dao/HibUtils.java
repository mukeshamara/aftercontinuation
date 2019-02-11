package com.dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;

import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibUtils {
	public static StandardServiceRegistry standardServiceRegistry;
	public static SessionFactory sessionFactory;
	static {
		if(sessionFactory==null) {
			standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build();			
			Metadata meta=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
			sessionFactory = meta.getSessionFactoryBuilder().build();
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
