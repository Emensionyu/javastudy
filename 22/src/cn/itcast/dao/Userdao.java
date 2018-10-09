package cn.itcast.dao;

import cn.itcast.pojo.User;

public interface Userdao {
	/**
	 *   这是用户登入功能
	 *   
	 */
	public abstract boolean islogin(String usename,String password);
	/**
	 * 这是用户注册功能
	 * @param user
	 * 要注册的用户信息
	 */
	public abstract void regist(User user);
	
}
