import java.util.Scanner;
public class guessnumber {
	public static void start() {
		int number=(int)(Math.random()*100)+1;
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你猜的数字");
		int number2=sc.nextInt();
		if(number2==number) {
			System.out.println("恭喜你猜对了，真是太聪明了");
			break;
			}
		else if(number2<number) {
			System.out.println("你猜的数字小了");}
			else {
				System.out.println("你猜的数字大了");
			}
			
		}
		
	

}
}
