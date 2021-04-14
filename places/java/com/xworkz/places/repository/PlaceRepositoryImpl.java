package com.xworkz.places.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.places.entity.PlaceDTO;

public class PlaceRepositoryImpl  implements PlaceRepository{
	
	private SessionFactory factory;
	
     public PlaceRepositoryImpl(SessionFactory factory) {
    	 System.out.println("invoked PlaceRepositoryImpl"+this.getClass().getSimpleName());
 		this.factory=factory;
 		 
     }
     
     
	@Override
	public void save(PlaceDTO entity) {
		// TODO Auto-generated method stub
    System.out.println("invoked save "+entity);
		
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		
	}

}
