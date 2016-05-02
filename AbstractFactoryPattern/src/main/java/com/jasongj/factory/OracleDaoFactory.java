package com.jasongj.factory;

import com.jasongj.dao.product.IProductDao;
import com.jasongj.dao.product.OracleProductDao;
import com.jasongj.dao.role.IRoleDao;
import com.jasongj.dao.role.OracleRoleDao;
import com.jasongj.dao.user.IUserDao;
import com.jasongj.dao.user.OracleUserDao;

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
