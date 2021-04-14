package com.xworkz.monuments.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.monuments.entity.MonumentDTO;

public class MonumentRepositoryImpl implements MonumentRepository{
	private SessionFactory factory;
	
	public MonumentRepositoryImpl(SessionFactory factory) {
		System.out.println("invoked ApplicationRepositoryImpl"+this.getClass().getSimpleName());
		this.factory=factory;
			
	}
	

	@Override
	public void save(MonumentDTO entity) {
		// TODO Auto-generated method stub
        System.out.println("invoked save "+entity);
		
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		
	}

}
