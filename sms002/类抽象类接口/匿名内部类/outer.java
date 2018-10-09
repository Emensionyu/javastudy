package 匿名内部类;

public class outer {
	public void method() {
	new  inner() {
		
	
		public void show() {
			System.out.println("show");
		}
		public void show2() {
			System.out.println("show2");
		}
		
	};

	}
}