package com.jasongj.factory;

import com.jasongj.dao.IUserDao;

public interface IDaoFactory {

	IUserDao createUserDao();

}
