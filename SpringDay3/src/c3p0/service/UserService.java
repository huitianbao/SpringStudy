package c3p0.service;

import c3p0.dao.UserDao;

public class UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void add(){
		userDao.add();
	}

}
