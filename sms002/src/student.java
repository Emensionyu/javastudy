
public class student extends person{
	int num=20;
	public void show() {
		int num=30;
		System.out.println(num);//d调
		System.out.println(this.num);//调本类成员变量
		System.out.println(super.num);//调父类成员变量
	}
	public student() {
		
	}
public student(String name,int age) {
	super();
		
	}


}
