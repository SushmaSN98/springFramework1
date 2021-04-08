package com.xworkz.fooodDelivery.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.fooodDelivery.entity.FooodItemEntity;

public class FooodItemRepositoryImpl implements FooodItemRepository{
	
	public FooodItemRepositoryImpl() {
		System.out.println("created "+ this.getClass().getSimpleName());
	}

	@Override
	public void save(FooodItemEntity entity) {
		// TODO Auto-generated method stub
		 System.out.println("invoked save"+ entity);
			System.out.println("save info database using JPA");
			
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
