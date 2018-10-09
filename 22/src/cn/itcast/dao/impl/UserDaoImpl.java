package cn.itcast.dao.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import cn.itcast.dao.Userdao;
import cn.itcast.pojo.User;

public class UserDaoImpl implements Userdao {
/**
 * �����û������ľ���ʵ���ࣨ���ϰ棩
 * @author mensionyu
 * 
 */
	private static File file=new File("user.txt");
	static {
		try {
			file.createNewFile();
			}catch(IOException e) {
				System.out.println("�����ļ�ʧ��");
			
		}
	}
	

	@Override
	public boolean islogin(String usename, String password) {
		// TODO Auto-generated method stub
		
		boolean flag=false;
		BufferedReader br=null;
		try {
			br=new BufferedReader(new FileReader(file));
			String line=null;
			while((line=br.readLine())!=null) {
				String[] date=line.split("=");
				if(date[0].equals(usename)&&date[1].equals(password)) {
					flag=true;
					break;
				}
				
			}
			
		} 
		catch(FileNotFoundException e) {
			System.out.println("�û������Ҳ����ļ�");
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("�û�����ʧ��");
		}finally {
			if(br!=null) {
				try {
				br.close();
			}catch(IOException e){
				System.out.println("�û������ͷ���Դʧ��");
			}
		}

		}
		return flag;
		
	}

	@Override
	public void regist(User user) {
		// TODO Auto-generated method stub
		BufferedWriter bw=null;
	try {
		 bw=new BufferedWriter(new FileWriter(file,true));
		bw.write(user.getUsername()+"="+user.getPassword());
		bw.newLine();
		bw.flush();
	}catch(IOException e) {
	System.out.println("�û�����ע��");
	}finally {
		if(bw!=null) {
			try {
		bw.close();
		}	catch(IOException e) {
			System.out.println("�û��ͷ���Դʧ��");
		}
	
	
	}
	}
}}