package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAopBook {
	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("bean3.xml");
		
		Book book=(Book)context.getBean("book");
		
		book.add();
	}

}
