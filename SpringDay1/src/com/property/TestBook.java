package com.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
	public static void main(String[] args){
		ApplicationContext context=
				new ClassPathXmlApplicationContext("Bean1.xml");
		
		Book book1=(Book)context.getBean("book");
		book1.demoBook();
		
	}

}
