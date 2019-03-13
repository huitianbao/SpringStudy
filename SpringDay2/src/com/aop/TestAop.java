package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
	public static void main(String[] args){
//		
//	      org.apache.log4j.LogManager.resetConfiguration();
//	      org.apache.log4j.PropertyConfigurator.configure("c:/log4j.properties");



	      
		ApplicationContext context=new ClassPathXmlApplicationContext("Aop.xml");
		Book book=(Book)context.getBean("book");
		book.add();
		
	}

}
