import java.util.Scanner;
public class guessnumber {
	public static void start() {
		int number=(int)(Math.random()*100)+1;
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��������µ�����");
		int number2=sc.nextInt();
		if(number2==number) {
			System.out.println("��ϲ��¶��ˣ�����̫������");
			break;
			}
		else if(number2<number) {
			System.out.println("��µ�����С��");}
			else {
				System.out.println("��µ����ִ���");
			}
			
		}
		
	

}
}
