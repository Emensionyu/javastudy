package ���������;
import java.util.Scanner;
public class lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     int number1=(int)(Math.random()*10);
     int number2=(int)(Math.random()*10);
     int number3=(int)(Math.random()*10);
     int number=number1*100+number2*10+number3;
     Scanner sc=new Scanner(System.in);
     System.out.println("�������㹺��ĵ�һ������");
     int guessnumber1=sc.nextInt();
     System.out.println("�������㹺��ĵڶ�������");
     int guessnumber2=sc.nextInt();
     System.out.println("�������㹺��ĵ���������");
     int guessnumber3=sc.nextInt();
     
	while(true) {
		
	System.out.println("�������㹺��ĺ���");
	Scanner s=new Scanner(System.in);
	int guessnumber=sc.nextInt();
	if(guessnumber==number) {
		System.out.println("��ϲ�н�");
		break;
	}else if(guessnumber<number) {
		System.out.println("��µ�����С��");
	}else if(guessnumber>number) {
		System.out.println("��µ����ִ���");
		}

	}
	}
}
