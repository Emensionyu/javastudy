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
			System.out.println("��µ�����"+guessnumber+"����");
		}else if(guessnumber<number) {
			System.out.println("��µ�����"+guessnumber+"С��");
		}else {
			System.out.println("��ϲ���"+count+"����");
			break;
		}
	}
}
}