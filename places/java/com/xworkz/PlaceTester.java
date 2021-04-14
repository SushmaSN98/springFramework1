package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.places.entity.PlaceDTO;
import com.xworkz.places.service.PlaceService;

public class PlaceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext container=new ClassPathXmlApplicationContext("place.xml" ,"place2.xml");
		
		PlaceService service=container.getBean(PlaceService.class);
		PlaceDTO entity=new PlaceDTO("ScaryHouse", "MantriMall", 100);
		service.saveAndValidate(entity);
		
		

	}

}
