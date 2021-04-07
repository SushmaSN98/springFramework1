package com.xworkz.fooodDelivery.repository;

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
		
	}

}
