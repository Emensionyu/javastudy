package ��;

public class student03 {
	int age;
	String name;
	
public student03() {
	System.out.println("�޲εĹ��췽��");
}
public student03(int age) {
	this.age=age;
}

public void show() {
	System.out.println(name+"��"+age);
}
public  static void main(String[]args) {
	student03 s3=new student03(24);
//	s3.name="����ѫ";
	s3.show();
	
}}