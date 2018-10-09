package 面向对象上;
import java.util.Scanner;
public class lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     int number1=(int)(Math.random()*10);
     int number2=(int)(Math.random()*10);
     int number3=(int)(Math.random()*10);
     int number=number1*100+number2*10+number3;
     Scanner sc=new Scanner(System.in);
     System.out.println("请输入你购买的第一个号码");
     int guessnumber1=sc.nextInt();
     System.out.println("请输入你购买的第二个号码");
     int guessnumber2=sc.nextInt();
     System.out.println("请输入你购买的第三个号码");
     int guessnumber3=sc.nextInt();
     
	while(true) {
		
	System.out.println("请输入你购买的号码");
	Scanner s=new Scanner(System.in);
	int guessnumber=sc.nextInt();
	if(guessnumber==number) {
		System.out.println("恭喜中奖");
		break;
	}else if(guessnumber<number) {
		System.out.println("你猜的数字小了");
	}else if(guessnumber>number) {
		System.out.println("你猜的数字大了");
		}

	}
	}
}
