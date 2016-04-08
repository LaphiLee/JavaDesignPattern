package com.jasongj.factory;

import com.jasongj.dao.role.IRoleDao;
import com.jasongj.dao.role.OracleRoleDao;
import com.jasongj.dao.user.IUserDao;
import com.jasongj.dao.user.OracleUserDao;
import com.jasongj.dao.user.product.IProductDao;
import com.jasongj.dao.user.product.OracleProductDao;

public class OracleDaoFactory implements IDaoFactory {

	@Override
	public IUserDao createUserDao() {
		return new OracleUserDao();
	}

	@Override
	public IRoleDao createRoleDao() {
		return new OracleRoleDao();
	}

	@Override
	public IProductDao createProductDao() {
		return new OracleProductDao();
	}

}
