package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fooodDelivery.constants.FooodType;
import com.xworkz.fooodDelivery.constants.Gender;
import com.xworkz.fooodDelivery.constants.VendorrType;
import com.xworkz.fooodDelivery.entity.CustomerrEntity;
import com.xworkz.fooodDelivery.entity.FooodItemEntity;
import com.xworkz.fooodDelivery.entity.HotelVendorEntity;
import com.xworkz.fooodDelivery.service.CustomerrService;
import com.xworkz.fooodDelivery.service.FooodItemService;
import com.xworkz.fooodDelivery.service.HotelVendorService;

public class AppTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext container=new ClassPathXmlApplicationContext("first.xml");
		FooodItemService service=container.getBean(FooodItemService.class);
		FooodItemEntity entity=new FooodItemEntity("Idli", 30, FooodType.SOUTHINDIAN, 01, 0);
		service.saveAndValidate(entity);
		
		CustomerrService service1=container.getBean(CustomerrService.class);
		CustomerrEntity entity1=new CustomerrEntity("Anjali", "Mangalore", 3.5, 9737625567l,"Anjali@gmail.com", Gender.WOMEN);
		service1.saveAndValidate(entity1);
		
		HotelVendorService service2=container.getBean(HotelVendorService.class);
		HotelVendorEntity entity2=new HotelVendorEntity("Impana","Bangalore", 4.5, VendorrType.WHOLESALERS);
		service2.saveAndValidate(entity2);
		}
	}
