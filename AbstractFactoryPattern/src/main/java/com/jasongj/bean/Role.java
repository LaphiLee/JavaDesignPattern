package com.jasongj.bean;

import org.apache.commons.lang.StringUtils;

public class Role {

	private String rolename;
	private String[] permissions;
	
	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String[] getPermissions() {
		return permissions;
	}

	public void setPermissions(String[] permissions) {
		this.permissions = permissions;
	}

	@Override
	public String toString() {
		return "{rolename=" + rolename + ", permissions=" + StringUtils.join(permissions, ", ") + "}";
	}

}
