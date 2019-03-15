package c3p0.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import c3p0.service.UserService;

public class Test {
	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("c3p0.xml");
		UserService userService=(UserService)context.getBean("userService");
		userService.add();
		
	}

}
