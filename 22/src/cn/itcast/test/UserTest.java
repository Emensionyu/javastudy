package cn.itcast.test;

import java.util.Scanner;

import cn.itcast.dao.Userdao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.game.GuessNumber;
import cn.itcast.pojo.User;

/**
 * 用户测试类
 * @author 的脸l.1
 *
 */
public class UserTest {
	public static void main(String[] args) {
		while(true) {
		 System.out.println("---------欢迎进入系统-------");
		 System.out.println("-------1:登入");
		 System.out.println("-------2:注册");
		 System.out.println("-------3:退出");
		 System.out.println("-------请输入你的选择");
		 Scanner sc=new Scanner(System.in);
		 String choise=sc.nextLine();
		 switch(choise){
			 case "1": System.out.println("-----------登入界面---------");
				 System.out.println("请输入用户名");
				 String newusername=sc.nextLine();
				 System.out.println("请输入密码");
				 String newpassword=sc.nextLine();
				 Userdao ud1=new UserDaoImpl();
				boolean flag= ud1.islogin(newusername, newpassword);
				 if(flag=true) {
					 System.out.println("----------恭喜你登入成功--------");
					 
					 GuessNumber.start();
				 System.exit(0);}
				 else {
					 System.out.println("------登入失败----------");
				 }
					 
				 break;
			 case "2":
				 System.out.println("-----------注册---------");
				 System.out.println("请输入用户名");
				 String newUsername=sc.nextLine();
				 System.out.println("请输入密码");
				 String newPassword=sc.nextLine();
				 User user=new User();
				 user.setUsername(newUsername);
				 user.setPassword(newPassword);
				 Userdao ud=new UserDaoImpl();
				 ud.regist(user);
				 
				 
				 break;
			
			 case"3":
			 defaule:
					 System.out.println("谢谢使用，欢迎下次再来");
				 System.exit(0);
				 break;
				 
		 }
		 
	}}
     
      
}
