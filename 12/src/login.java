import java.util.Scanner;
public class login {

	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 String username="mensionyu";
		 String password="abc123";
		 for(int x=0;x<3;x++) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入用户名");
		String name=sc.nextLine();
		System.out.println("请输入密码");
		String pwd=sc.nextLine();
		
			
		if(username.equals(name)&&password.equals(pwd)) {
				System.out.println("登入成功");
				guessnumber.start();
				break;
			}else 
			{
				
				if((2-x)==0) 
				System.out.println("账号已被·锁定");
				else
				{
					System.out.println("登入失败,你还有"+(2-x)+"次机会");
				}
		
			}
				
				
			}

	}

}
