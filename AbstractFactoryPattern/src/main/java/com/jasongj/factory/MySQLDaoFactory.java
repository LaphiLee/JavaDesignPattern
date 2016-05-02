package com.jasongj.factory;

import com.jasongj.dao.product.IProductDao;
import com.jasongj.dao.product.MySQLProductDao;
import com.jasongj.dao.role.IRoleDao;
import com.jasongj.dao.role.MySQLRoleDao;
import com.jasongj.dao.user.IUserDao;
import com.jasongj.dao.user.MySQLUserDao;

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
