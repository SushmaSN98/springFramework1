package com.xworkz.monuments.service;

import com.xworkz.monuments.entity.MonumentDTO;
import com.xworkz.monuments.repository.MonumentRepository;

public class MonumentServiceImpl implements MonumentService {
	
	private MonumentRepository repository;
	
	public MonumentServiceImpl(MonumentRepository repository) {
		System.out.println("invoked ApplicationServiceImpl"+this.getClass().getSimpleName());
 		this.repository=repository;
     	
	}

	@Override
	public boolean saveAndValidate(MonumentDTO entity) {
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
