package cn.itcast.dao;

import cn.itcast.pojo.User;

public interface Userdao {
	/**
	 *   �����û����빦��
	 *   
	 */
	public abstract boolean islogin(String usename,String password);
	/**
	 * �����û�ע�Ṧ��
	 * @param user
	 * Ҫע����û���Ϣ
	 */
	public abstract void regist(User user);
	
}
