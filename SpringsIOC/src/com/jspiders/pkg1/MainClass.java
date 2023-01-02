package com.jspiders.pkg1;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("Spring1.xml");
	Person1 p1=context.getBean("project2",Person1.class);
	System.out.println(p1);
	
	Person p2=context.getBean("project1",Person.class);
	System.out.println(p2);
}
}

//ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml")
//Person p1=(Person)context.
//System.out.println(p1);
//
//Person1 p2=(Person1)context.getBean("project2");
//System.out.println(p2);
//new ClassPathXmlApplicationContext("Spring.xml");