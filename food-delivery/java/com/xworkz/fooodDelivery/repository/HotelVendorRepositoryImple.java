package com.xworkz.fooodDelivery.repository;

import com.xworkz.fooodDelivery.entity.HotelVendorEntity;

public class HotelVendorRepositoryImple implements HotelVendorRepository{
	
	public HotelVendorRepositoryImple(){
		
	}

	@Override
	public void save(HotelVendorEntity entity) {
		// TODO Auto-generated method stub
		System.out.println("invoked save"+entity);
		System.out.println("saved in database");
		
	}

}
