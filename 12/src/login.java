import java.util.Scanner;
public class login {

	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 String username="mensionyu";
		 String password="abc123";
		 for(int x=0;x<3;x++) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������û���");
		String name=sc.nextLine();
		System.out.println("����������");
		String pwd=sc.nextLine();
		
			
		if(username.equals(name)&&password.equals(pwd)) {
				System.out.println("����ɹ�");
				guessnumber.start();
				break;
			}else 
			{
				
				if((2-x)==0) 
				System.out.println("�˺��ѱ�������");
				else
				{
					System.out.println("����ʧ��,�㻹��"+(2-x)+"�λ���");
				}
		
			}
				
				
			}

	}

}
