package com.xworkz.fooodDelivery.service;

import com.xworkz.fooodDelivery.entity.FooodItemEntity;
import com.xworkz.fooodDelivery.repository.FooodItemRepository;
import com.xworkz.fooodDelivery.repository.FooodItemRepositoryImpl;

public class FooodItemServiceImpl implements FooodItemService {
	
	private FooodItemRepository repository=new FooodItemRepositoryImpl();
	
	public FooodItemServiceImpl(FooodItemRepository repository) {
		System.out.println("created"+ this.getClass().getSimpleName());
		this.repository=repository;
		
	}
	

	@Override
	public boolean saveAndValidate(FooodItemEntity entity) {
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
