package cn.itcast.test;

import java.util.Scanner;

import cn.itcast.dao.Userdao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.game.GuessNumber;
import cn.itcast.pojo.User;

/**
 * �û�������
 * @author ����l.1
 *
 */
public class UserTest {
	public static void main(String[] args) {
		while(true) {
		 System.out.println("---------��ӭ����ϵͳ-------");
		 System.out.println("-------1:����");
		 System.out.println("-------2:ע��");
		 System.out.println("-------3:�˳�");
		 System.out.println("-------���������ѡ��");
		 Scanner sc=new Scanner(System.in);
		 String choise=sc.nextLine();
		 switch(choise){
			 case "1": System.out.println("-----------�������---------");
				 System.out.println("�������û���");
				 String newusername=sc.nextLine();
				 System.out.println("����������");
				 String newpassword=sc.nextLine();
				 Userdao ud1=new UserDaoImpl();
				boolean flag= ud1.islogin(newusername, newpassword);
				 if(flag=true) {
					 System.out.println("----------��ϲ�����ɹ�--------");
					 
					 GuessNumber.start();
				 System.exit(0);}
				 else {
					 System.out.println("------����ʧ��----------");
				 }
					 
				 break;
			 case "2":
				 System.out.println("-----------ע��---------");
				 System.out.println("�������û���");
				 String newUsername=sc.nextLine();
				 System.out.println("����������");
				 String newPassword=sc.nextLine();
				 User user=new User();
				 user.setUsername(newUsername);
				 user.setPassword(newPassword);
				 Userdao ud=new UserDaoImpl();
				 ud.regist(user);
				 
				 
				 break;
			
			 case"3":
			 defaule:
					 System.out.println("ллʹ�ã���ӭ�´�����");
				 System.exit(0);
				 break;
				 
		 }
		 
	}}
     
      
}
