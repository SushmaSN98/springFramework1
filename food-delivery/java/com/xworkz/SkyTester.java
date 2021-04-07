package com.xworkz;

import com.xworkz.fooodDelivery.constants.FooodType;
import com.xworkz.fooodDelivery.constants.Gender;
import com.xworkz.fooodDelivery.constants.VendorrType;
import com.xworkz.fooodDelivery.entity.CustomerrEntity;
import com.xworkz.fooodDelivery.entity.FooodItemEntity;
import com.xworkz.fooodDelivery.entity.HotelVendorEntity;
import com.xworkz.fooodDelivery.repository.CustomerrRepository;
import com.xworkz.fooodDelivery.repository.CustomerrRepositoryImple;
import com.xworkz.fooodDelivery.repository.FooodItemRepository;
import com.xworkz.fooodDelivery.repository.FooodItemRepositoryImpl;
import com.xworkz.fooodDelivery.repository.HotelVendorRepository;
import com.xworkz.fooodDelivery.repository.HotelVendorRepositoryImple;
import com.xworkz.fooodDelivery.service.CustomerrService;
import com.xworkz.fooodDelivery.service.CustomerrServiceImpl;
import com.xworkz.fooodDelivery.service.FooodItemService;
import com.xworkz.fooodDelivery.service.FooodItemServiceImpl;
import com.xworkz.fooodDelivery.service.HotelVendorService;
import com.xworkz.fooodDelivery.service.HotelVendorServiceImpl;

public class SkyTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FooodItemEntity entity=new FooodItemEntity("Sprite" ,30,FooodType.DRINKS,1,0);
	    FooodItemRepository rep=new FooodItemRepositoryImpl();
		FooodItemService service=new FooodItemServiceImpl(rep);
		service.saveAndValidate(entity);
		
		CustomerrEntity entity1=new CustomerrEntity("Mandara","Bangalore",4.0,8765898863l,"mandaray@gmail.com",Gender.WOMEN);
		
		CustomerrRepository repos=new CustomerrRepositoryImple();
		CustomerrService serv=new CustomerrServiceImpl(repos);
		serv.saveAndValidate(entity1);
		
		HotelVendorEntity entity2 =new HotelVendorEntity("Tanu","Bangalore",4.0,VendorrType.WHOLESALERS);
		
		HotelVendorRepository repo=new HotelVendorRepositoryImple();
		HotelVendorService ser=new HotelVendorServiceImpl(repo);
	    ser.saveAndValidate(entity2);

	}

}
