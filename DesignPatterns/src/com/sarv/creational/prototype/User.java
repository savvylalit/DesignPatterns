package com.sarv.creational.prototype;

public class User {
	private String userName;
	private String level;
	private AccessControl accessControl;
	
	public User(String userName, String level, AccessControl accessControl) {
		super();
		this.userName = userName;
		this.level = level;
		this.accessControl = accessControl;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public AccessControl getAccessControl() {
		return accessControl;
	}

	public void setAccessControl(AccessControl accessControl) {
		this.accessControl = accessControl;
	}

	@Override
	public String toString() {
		return String.format("User [userName=%s, level=%s, accessControl=%s]", userName, level, accessControl);
	}
	
	
	
	
}
