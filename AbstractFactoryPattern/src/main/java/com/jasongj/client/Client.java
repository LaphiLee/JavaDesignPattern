package com.jasongj.client;

import com.jasongj.bean.Product;
import com.jasongj.bean.User;
import com.jasongj.dao.product.IProductDao;
import com.jasongj.dao.role.IRoleDao;
import com.jasongj.dao.user.IUserDao;
import com.jasongj.factory.IDaoFactory;
import com.jasongj.factory.MySQLDaoFactory;

public class Client {

	public static void main(String[] args) {
		IDaoFactory factory = new MySQLDaoFactory();
		
		IUserDao userDao = factory.createUserDao();
		User user = new User();
		user.setUsername("demo");
		user.setPassword("demo".toCharArray());
		userDao.addUser(user);
		
		IRoleDao roleDao = factory.createRoleDao();
		roleDao.getRole("admin");
		
		IProductDao productDao = factory.createProductDao();
		Product product = new Product();
		productDao.removeProduct(product);

	}

}
