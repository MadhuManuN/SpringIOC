package com.jspiders.pkg1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass1 {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Spring2.xml");
	Student s1=context.getBean("stu",Student.class);
	Student s2=context.getBean("stu1",Student.class);
s1.cheating();
s2.cheating();
}
}
