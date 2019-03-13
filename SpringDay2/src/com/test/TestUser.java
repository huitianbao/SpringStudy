package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anno.User;

public class TestUser {
	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		User user1=(User)context.getBean("user");
		User user2=(User)context.getBean("user");
		user1.add();
		System.out.println("user1   "+user1);
		System.out.println("user2   "+user2);
		
	}

}
