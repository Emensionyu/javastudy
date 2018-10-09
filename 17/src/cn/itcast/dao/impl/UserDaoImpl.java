package cn.itcast.dao.impl;

import java.util.ArrayList;

import cn.itcast.dao.Userdao;
import cn.itcast.pojo.User;

public class UserDaoImpl implements Userdao {
/**
 * 这是用户操作的具体实现类（集合版）
 * @author mensionyu
 * 
 */
	//为了让多个对象共用同一个成员变量，用static
	private static ArrayList<User> array=new ArrayList<User>();//为了让多个方法都能访问到一个集合，把集合定义为成员变量
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
