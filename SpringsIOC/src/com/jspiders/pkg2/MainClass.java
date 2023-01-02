package com.jspiders.pkg2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringAirtel.xml");
		Airtel airtel=context.getBean("airtel",Airtel.class);
		airtel.activateService();
	}
}
