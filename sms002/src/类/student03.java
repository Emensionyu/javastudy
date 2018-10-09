package 类;

public class student03 {
	int age;
	String name;
	
public student03() {
	System.out.println("无参的构造方法");
}
public student03(int age) {
	this.age=age;
}

public void show() {
	System.out.println(name+"和"+age);
}
public  static void main(String[]args) {
	student03 s3=new student03(24);
//	s3.name="吴世勋";
	s3.show();
	
}}