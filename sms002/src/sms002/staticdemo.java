package sms002;

public class staticdemo {
	public int data1;
	public static int data2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			staticdemo s1=new staticdemo();
			staticdemo s2=new staticdemo();
			s1.data1=100;
			s2.data1=200;
			//s1.data2=300;
			//s2.data2=400;
			//s2.data2=900;
			//exam01.data2=500;
			//exam01.data2=1000;
			//exam01.data1=600;
			System.out.println(s1.data1);
			System.out.println(s2.data1);
			System.out.println(s1.data2);
			System.out.println(s1.data2);
	}

}
