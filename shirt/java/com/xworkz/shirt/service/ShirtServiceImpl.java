package com.xworkz.shirt.service;

import com.xworkz.shirt.entity.ShirtDTO;
import com.xworkz.shirt.repository.ShirtRepository;

public class ShirtServiceImpl implements ShirtService {
	
	private ShirtRepository repository;
	public ShirtServiceImpl(ShirtRepository repository) {
	System.out.println("invoked ApplicationServiceImpl"+this.getClass().getSimpleName());
		this.repository=repository;
	}

	@Override
	public boolean saveAndValidate(ShirtDTO entity) {
		// TODO Auto-generated method stub
		System.out.println("invoked saveAndValidate "+entity);
		if(entity!=null) {
			System.out.println("entity is valid");
			repository.save(entity);
		}
		else {
			System.out.println("entity is invalid");
		}
		
		return false;
	}

}
