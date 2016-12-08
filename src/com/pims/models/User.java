package com.pims.models;

public class User {
	
	private Integer id;
	private String username;
	private String password;
	private String name;
	private String sex;
	private String birth;
	private String nation;
	private String edu;
	private String work;
	private String phone;
	private String place;
	private String email;

	public User() {
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	//TODO:Éú³ÉgetterºÍsetter
}
