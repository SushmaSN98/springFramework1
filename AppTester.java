package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

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
		
		
		ApplicationContext container=new ClassPathXmlApplicationContext("first.xml","application-db.xml");
		FooodItemService service=container.getBean(FooodItemService.class);
		FooodItemEntity entity=new FooodItemEntity("Dosa", 40, FooodType.SOUTHINDIAN, 02, 10);
		service.saveAndValidate(entity);
		
		CustomerrService service1=container.getBean(CustomerrService.class);
		CustomerrEntity entity1=new CustomerrEntity("Anusha", "Shivamoga", 4.5, 9737628747l,"anusha@gmail.com", Gender.WOMEN);
		service1.saveAndValidate(entity1);
		
		HotelVendorService service2=container.getBean(HotelVendorService.class);
		HotelVendorEntity entity2=new HotelVendorEntity("Suparna","Sagara", 4.0, VendorrType.RETAILERS);
		service2.saveAndValidate(entity2);
		}
	}
