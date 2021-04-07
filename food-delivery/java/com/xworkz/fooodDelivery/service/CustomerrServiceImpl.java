package com.xworkz.fooodDelivery.service;

import com.xworkz.fooodDelivery.entity.CustomerrEntity;
import com.xworkz.fooodDelivery.repository.CustomerrRepository;
import com.xworkz.fooodDelivery.repository.CustomerrRepositoryImple;

public class CustomerrServiceImpl implements CustomerrService{
	
	private CustomerrRepository repository=new CustomerrRepositoryImple();
	
	public CustomerrServiceImpl(CustomerrRepository repository) {
		System.out.println("created"+ this.getClass().getSimpleName());
		this.repository=repository;
	}

	@Override
	public boolean saveAndValidate(CustomerrEntity entity) {
		// TODO Auto-generated method stub
		if(entity !=null) {
			System.out.println("entity is valid");
			
			repository.save(entity);
		}else {
			System.out.println("entity is invalid");
		}
		return false;
	}

}
