package com.jasongj.factory;

import com.jasongj.dao.role.IRoleDao;
import com.jasongj.dao.user.IUserDao;
import com.jasongj.dao.user.product.IProductDao;

public interface IDaoFactory {

	IUserDao createUserDao();
	IRoleDao createRoleDao();
	IProductDao createProductDao();

}
