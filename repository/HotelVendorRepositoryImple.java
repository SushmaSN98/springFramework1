package com.xworkz.fooodDelivery.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.fooodDelivery.entity.HotelVendorEntity;

public class HotelVendorRepositoryImple implements HotelVendorRepository{
	
	private SessionFactory factory;
	
	public HotelVendorRepositoryImple(SessionFactory factory){
		System.out.println("created"+ this.getClass().getSimpleName());
		this.factory=factory;	
	}

	@Override
	public void save(HotelVendorEntity entity) {
		// TODO Auto-generated method stub
		System.out.println("invoked save"+entity);
		System.out.println("saved in database");
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(entity);
		transaction.commit();
		session.close();
		
	}

}
