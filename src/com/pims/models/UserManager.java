package com.pims.models;

import java.sql.Connection;

public class UserManager {
	private User user;

	public UserManager() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * ��Servlet����User�����������ݴ������ݿ�
	 * @param user
	 */
	public void add(User user){
	}


	/**
	 * ��Servlet�˵��ã����ݴ��ݹ�����id�����ض����û�
	 * @param id
	 * @return ָ�����û�
	 */
	public User findOne(Integer id){
		return null;
	}
	
	/**
	 * �����û��������û�
	 * @return �û�
	 */
	public User findByUsername(String username){
		return null;
	}
	
	/**
	 *  ��Servlet����user�����������ݿ��ڵ��û������޸ġ�
	 * @param user
	 */
	public void update(User user){
		
	}
	
	/**
	 * ��Servlet����User�����������ݿ��ѯ�˺������Ƿ���ƥ�䡣
	 * @param user
	 * @return ƥ�䷵��true���򷵻�false
	 */
	public Boolean authUser(User user){
		return false;
	}
	
	public Connection getConncetion(){
		return null;
	}
	
}
