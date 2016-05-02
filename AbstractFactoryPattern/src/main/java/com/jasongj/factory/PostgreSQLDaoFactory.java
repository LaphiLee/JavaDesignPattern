package com.jasongj.factory;

import com.jasongj.dao.product.IProductDao;
import com.jasongj.dao.product.PostgreSQLProductDao;
import com.jasongj.dao.role.IRoleDao;
import com.jasongj.dao.role.PostgreSQLRoleDao;
import com.jasongj.dao.user.IUserDao;
import com.jasongj.dao.user.PostgreSQLUserDao;

public class PostgreSQLDaoFactory implements IDaoFactory {

	@Override
	public IUserDao createUserDao() {
		return new PostgreSQLUserDao();
	}

	@Override
	public IRoleDao createRoleDao() {
		return new PostgreSQLRoleDao();
	}

	@Override
	public IProductDao createProductDao() {
		return new PostgreSQLProductDao();
	}

}
