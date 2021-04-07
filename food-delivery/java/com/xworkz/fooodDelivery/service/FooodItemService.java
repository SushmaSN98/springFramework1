package com.xworkz.fooodDelivery.service;

import com.xworkz.fooodDelivery.entity.FooodItemEntity;

public interface FooodItemService {
	boolean saveAndValidate(FooodItemEntity entity);
}
