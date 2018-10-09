package Àà;

public class student2 {
	private String name;
	private int age;
	String sex;
	public int getage(int age) {
		return this.age=age;
	}
	public String getsex() {
		return sex;
	}
	public void setsex(String sex) {
		this.sex=sex;
	}
	/*public void setage(int age) {
		this.age=age;
	}*/
	/*public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
*/
public static void main(String[]args) {
	student2 s2=new student2();
	//s2.setage(24);
	//s2.setname("ÎâÊÀÑ«");
	s2.setsex("ÄĞ");
	System.out.println(s2.getage(24));
	System.out.println(s2.getsex());
	
}}