package com.property.userService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("Bean1.xml");
		UserService userService=(UserService)context.getBean("userService");
		UserDao userDao=(UserDao)context.getBean("userDao");
		userService.setUserDao(userDao);
		userService.test_UserService();
		
	}

	
	

}
