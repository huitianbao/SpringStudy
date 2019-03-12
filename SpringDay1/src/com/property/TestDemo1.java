package com.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo1 {

	public static void main(String[] args){
		ApplicationContext context=
				new ClassPathXmlApplicationContext("Bean1.xml");
		
		PropertyDemo1 propertyDemo1=(PropertyDemo1)context.getBean("demo11");
		propertyDemo1.test_demo1();
	}
}
