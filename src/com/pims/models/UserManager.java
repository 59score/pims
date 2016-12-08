package com.pims.models;

import java.sql.Connection;

public class UserManager {
	private User user;

	public UserManager() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * 从Servlet传递User过来，将数据存入数据库
	 * @param user
	 */
	public void add(User user){
	}


	/**
	 * 在Servlet端调用，根据传递过来的id查找特定的用户
	 * @param id
	 * @return 指定的用户
	 */
	public User findOne(Integer id){
		return null;
	}
	
	/**
	 * 根据用户名查找用户
	 * @return 用户
	 */
	public User findByUsername(String username){
		return null;
	}
	
	/**
	 *  从Servlet传递user过来，将数据库内的用户内容修改。
	 * @param user
	 */
	public void update(User user){
		
	}
	
	/**
	 * 从Servlet传递User过来，从数据库查询账号密码是否相匹配。
	 * @param user
	 * @return 匹配返回true否则返回false
	 */
	public Boolean authUser(User user){
		return false;
	}
	
	public Connection getConncetion(){
		return null;
	}
	
}
