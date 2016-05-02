package com.jasongj.factory;

import com.jasongj.dao.product.IProductDao;
import com.jasongj.dao.role.IRoleDao;
import com.jasongj.dao.user.IUserDao;

public interface IDaoFactory {

	IUserDao createUserDao();
	IRoleDao createRoleDao();
	IProductDao createProductDao();

}
