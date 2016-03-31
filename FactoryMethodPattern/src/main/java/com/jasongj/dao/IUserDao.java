package com.jasongj.dao;

import com.jasongj.bean.User;

public interface IUserDao {
	
	void addUser(User user);
	void removeUser(User user);
	User getUser(String username);

}
