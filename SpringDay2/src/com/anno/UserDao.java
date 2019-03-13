package com.anno;

import org.springframework.stereotype.Component;

@Component(value="userDao")
public class UserDao {
	public void getUserDao(){
		System.out.println("this is UserDao..............");
	}

}
