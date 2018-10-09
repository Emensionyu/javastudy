package 成员内部类;

public class outer {
		private int num=10;
		class inter{
			public void method() {
				System.out.println(num);
			}
		}
}
