package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.monuments.entity.MonumentDTO;
import com.xworkz.monuments.service.MonumentService;

public class MonumentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext container=new ClassPathXmlApplicationContext("monument.xml","monument2.xml");
		
		MonumentService  service=container.getBean(MonumentService.class);
		MonumentDTO entity=new MonumentDTO("TajMahal","Agra", 12);
		service.saveAndValidate(entity);
		

	}

}
