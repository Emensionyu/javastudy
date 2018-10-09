package cn.itcast.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private GuessNumber() {}
	public static void start() {
		int number=(int)(Math.random()*100+1);
		int count=0;
		
			while(true) {
		Scanner sc=new Scanner(System.in);
		count++;
		int guessnumber=sc.nextInt();
		if(guessnumber>number) {
			System.out.println("你猜的数字"+guessnumber+"大了");
		}else if(guessnumber<number) {
			System.out.println("你猜的数字"+guessnumber+"小了");
		}else {
			System.out.println("恭喜你猜"+count+"中了");
			break;
		}
	}
}
}