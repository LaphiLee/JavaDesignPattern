package com.jasongj.dao.role;

import com.jasongj.bean.Role;

public interface IRoleDao {
	
	void addRole(Role role);
	void removeRole(Role role);
	Role getRole(String rolename);

}
