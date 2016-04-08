package com.jasongj.factory;

import com.jasongj.dao.role.IRoleDao;
import com.jasongj.dao.role.MySQLRoleDao;
import com.jasongj.dao.user.IUserDao;
import com.jasongj.dao.user.MySQLUserDao;
import com.jasongj.dao.user.product.IProductDao;
import com.jasongj.dao.user.product.MySQLProductDao;

public class MySQLDaoFactory implements IDaoFactory {

	@Override
	public IUserDao createUserDao() {
		return new MySQLUserDao();
	}

	@Override
	public IRoleDao createRoleDao() {
		return new MySQLRoleDao();
	}

	@Override
	public IProductDao createProductDao() {
		return new MySQLProductDao();
	}

}
