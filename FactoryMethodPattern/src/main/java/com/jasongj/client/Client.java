package com.jasongj.client;

import com.jasongj.dao.IUserDao;
import com.jasongj.factory.IDaoFactory;
import com.jasongj.factory.MySQLDaoFactory;

public class Client {

	public static void main(String[] args) {
		IDaoFactory factory = new MySQLDaoFactory();
		IUserDao userDao = factory.createUserDao();
		userDao.getUser("admin");

	}

}
