package com.xworkz.shirt.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.shirt.entity.ShirtDTO;

public class ShirtRepositoryImpl implements ShirtRepository{
	
	private SessionFactory factory;
	
	public ShirtRepositoryImpl(SessionFactory factory) {
		System.out.println("invoked PlaceRepositoryImpl"+this.getClass().getSimpleName());
 		this.factory=factory;
		
	}

	@Override
	public void save(ShirtDTO entity) {
		// TODO Auto-generated method stub
     System.out.println("invoked save "+entity);
		
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		
		
	}

}
