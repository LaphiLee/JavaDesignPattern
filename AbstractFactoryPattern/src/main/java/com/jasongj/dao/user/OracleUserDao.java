package com.jasongj.dao.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jasongj.bean.User;

public class OracleUserDao implements IUserDao {

	private static final Logger LOG = LoggerFactory.getLogger(OracleUserDao.class);

	@Override
	public void addUser(User user) {
		LOG.info("Oracle added User {}", user);
	}

	@Override
	public void removeUser(User user) {
		LOG.info("Oracle removed User {}", user);
	}

	@Override
	public User getUser(String username) {
		User user = new User();
		user.setUsername(username);
		return user;
	}

}
