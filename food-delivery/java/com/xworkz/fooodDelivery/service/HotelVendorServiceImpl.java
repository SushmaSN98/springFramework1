
package com.xworkz.fooodDelivery.service;

import com.xworkz.fooodDelivery.entity.HotelVendorEntity;
import com.xworkz.fooodDelivery.repository.HotelVendorRepository;
import com.xworkz.fooodDelivery.repository.HotelVendorRepositoryImple;

public class HotelVendorServiceImpl implements HotelVendorService {
	
	private HotelVendorRepository  repository=new HotelVendorRepositoryImple();
	
	public HotelVendorServiceImpl(HotelVendorRepository repository) {
		System.out.println("created"+ this.getClass().getSimpleName());
		this.repository=repository;
	}

	@Override
	public boolean saveAndValidate(HotelVendorEntity entity) {
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
