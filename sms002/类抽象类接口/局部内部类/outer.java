package 局部内部类;

public class outer {
	private int num=10;
	public void method() {
		final int num2=20;
	class inner{
		public void show() {
			System.out.println(num);
		}
		public void show2() {
			System.out.println(num2);
		}
		
	}
	inner oi=new inner();
	oi.show();
	oi.show2();
	}
}
