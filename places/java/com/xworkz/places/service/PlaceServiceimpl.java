package com.xworkz.places.service;


import com.xworkz.places.entity.PlaceDTO;
import com.xworkz.places.repository.PlaceRepository;

public class PlaceServiceimpl implements PlaceService{
	
	private PlaceRepository repository;
	public PlaceServiceimpl(PlaceRepository repository) {
		System.out.println("invoked ApplicationServiceImpl"+this.getClass().getSimpleName());
 		this.repository=repository;
		
	}

	@Override
	public boolean saveAndValidate(PlaceDTO entity) {
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
