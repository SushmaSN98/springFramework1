package com.xworkz.fooodDelivery.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.fooodDelivery.entity.HotelVendorEntity;

public class HotelVendorRepositoryImple implements HotelVendorRepository{
	
	public HotelVendorRepositoryImple(){
		
	}

	@Override
	public void save(HotelVendorEntity entity) {
		// TODO Auto-generated method stub
		System.out.println("invoked save"+entity);
		System.out.println("saved in database");
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		factory.close();
		
	}

}
