package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.xworkz.application.entity.ApplicationDTO;
import com.xworkz.application.service.ApplicationService;

public class ATester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext container=new ClassPathXmlApplicationContext("firstres.xml","secondres.xml");
		
		ApplicationService service=container.getBean(ApplicationService.class);
		ApplicationDTO entity=new ApplicationDTO("Inchara"," inchara@gmail.com", "Medical", 9865488534l, "Badravathi");
		service.saveAndValidate(entity);
	}}
		