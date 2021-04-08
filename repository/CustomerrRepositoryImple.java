package com.xworkz.fooodDelivery.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.fooodDelivery.entity.CustomerrEntity;


public class CustomerrRepositoryImple implements CustomerrRepository {
	
	public CustomerrRepositoryImple(){
		System.out.println("created"+ this.getClass().getSimpleName());
		
	}

	@Override
	public void save(CustomerrEntity entity) {
		// TODO Auto-generated method stub
		System.out.println("invoked save"+entity);
		System.out.println("save in database ");
		
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
