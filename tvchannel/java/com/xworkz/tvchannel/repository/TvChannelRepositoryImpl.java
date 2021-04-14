package com.xworkz.tvchannel.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.tvchannel.entity.TvChannelDTO;

public class TvChannelRepositoryImpl implements TvChannelRepository{
	
	private SessionFactory factory;
	
	public TvChannelRepositoryImpl(SessionFactory factory) {
		System.out.println("invoked PlaceRepositoryImpl"+this.getClass().getSimpleName());
 		this.factory=factory;
	}
	

	@Override
	public void save(TvChannelDTO entity) {
		// TODO Auto-generated method stub
        System.out.println("invoked save "+entity);
		
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		
		
	}

}
