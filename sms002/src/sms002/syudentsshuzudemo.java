package sms002;

public class syudentsshuzudemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student[] arrstudent=new student[10];
		for(int i=0;i<10;i++) {
			arrstudent[i]=new student();
			arrstudent[i].age=(int)(16+Math.random()*6);
			System.out.println(arrstudent[i].age);
		}

	}

}
