package cn.itcast.dao.impl;

import java.util.ArrayList;

import cn.itcast.dao.Userdao;
import cn.itcast.pojo.User;

public class UserDaoImpl implements Userdao {
/**
 * �����û������ľ���ʵ���ࣨ���ϰ棩
 * @author mensionyu
 * 
 */
	//Ϊ���ö��������ͬһ����Ա��������static
	private static ArrayList<User> array=new ArrayList<User>();//Ϊ���ö���������ܷ��ʵ�һ�����ϣ��Ѽ��϶���Ϊ��Ա����
	@Override
	public boolean islogin(String usename, String password) {
		// TODO Auto-generated method stub

		boolean flag=false;
		for(User u:array) {
			if(u.getUsername().equals(usename)&&u.getPassword().equals(password))
				flag=true;
			break;
		}
		
		return false;
	}

	@Override
	public void regist(User user) {
		// TODO Auto-generated method stub
	
		array.add(user);
	}

}
