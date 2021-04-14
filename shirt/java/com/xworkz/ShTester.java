package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.shirt.entity.ShirtDTO;
import com.xworkz.shirt.service.ShirtService;

public class ShTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext container=new ClassPathXmlApplicationContext("shirt.xml","shirt2.xml");
		
		ShirtService service=container.getBean(ShirtService.class);
		ShirtDTO entity=new ShirtDTO("white", 250.0, 2);
		service.saveAndValidate(entity);

	}

}
