package com.xworkz.tvchannel.service;

import com.xworkz.tvchannel.entity.TvChannelDTO;
import com.xworkz.tvchannel.repository.TvChannelRepository;

public class TvChannelServiceImpl implements TvChannelService {
	
	private TvChannelRepository repository;
	
	public TvChannelServiceImpl(TvChannelRepository repository) {
		System.out.println("invoked ApplicationServiceImpl"+this.getClass().getSimpleName());
 		this.repository=repository;
	}

	@Override
	public boolean saveAndValidate(TvChannelDTO entity) {
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
