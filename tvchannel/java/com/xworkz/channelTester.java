package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.tvchannel.entity.TvChannelDTO;
import com.xworkz.tvchannel.service.TvChannelService;

public class channelTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext container=new ClassPathXmlApplicationContext("channel.xml","channel2.xml");
		TvChannelService service=container.getBean(TvChannelService.class);
		TvChannelDTO entity=new TvChannelDTO("ZeeKannada", "Kannada");
		
		service.saveAndValidate(entity);

	}

}
