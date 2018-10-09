package trycatch;

import java.util.Scanner;

public class studentdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		teacher t=new teacher();
		try{t.check(score);
		} catch(myexception e){
			e.printStackTrace();
			
		}

	}

}
