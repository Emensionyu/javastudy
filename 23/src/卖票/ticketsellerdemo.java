package ��Ʊ;

public class ticketsellerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ticketseller my=new ticketseller();
		Thread s1=new Thread(my);
		Thread s2=new Thread(my);
		Thread s3=new Thread(my);
		s1.setName("����1");
		s2.setName("����2");
		s3.setName("����3");
		s1.start();
		s2.start();
		s3.start();
		

	}

}
