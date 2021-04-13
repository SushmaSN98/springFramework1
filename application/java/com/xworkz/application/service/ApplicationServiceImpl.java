package com.xworkz.application.service;

import com.xworkz.application.entity.ApplicationDTO;
import com.xworkz.application.repository.ApplicationRepository;

public class ApplicationServiceImpl implements ApplicationService {
	
	private ApplicationRepository repository;
     public ApplicationServiceImpl(ApplicationRepository repository) {
    	 System.out.println("invoked ApplicationServiceImpl"+this.getClass().getSimpleName());
 		this.repository=repository;
     }
	@Override
	public boolean saveAndValidate(ApplicationDTO entity) {
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
