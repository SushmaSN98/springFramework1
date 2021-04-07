package com.xworkz.fooodDelivery.repository;

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
	}

}
