package com.htb.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.property.Person;

public class TestPerson {
	public static void main(String[] args){
		// ���������ռ�ע��
		ApplicationContext context=new ClassPathXmlApplicationContext("Bean1.xml");
		Person person=(Person)context.getBean("person");
		person.testPserson();
		
	}

			

}
