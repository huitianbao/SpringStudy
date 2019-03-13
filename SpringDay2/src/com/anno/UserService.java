package com.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(value="userService")
public class UserService {
//	@Autowired
	@Resource(name="userDao")
	private UserDao userDao;
	
	public void getService(){
		System.out.println("this is userservice...........");
		userDao.getUserDao();
	}

}
