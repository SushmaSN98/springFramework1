package com.xworkz.monuments.service;

import com.xworkz.monuments.entity.MonumentDTO;

public interface MonumentService {
	public boolean saveAndValidate(MonumentDTO entity);
}
