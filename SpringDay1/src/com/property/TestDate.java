package com.property;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDate {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Date.xml");

		Date date = (Date) context.getBean("date");
		date.testDate();

	}

}
