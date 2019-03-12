package com.property.userService;

public class UserService {
	private UserDao userDao;

	

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void test_UserService(){
		userDao.testUserDao();
		System.out.println("this is userService");
	}
	

}
