package com.capgi.dto;

public class User {
	private String fName;
	private String lName;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public User(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
	}

}
