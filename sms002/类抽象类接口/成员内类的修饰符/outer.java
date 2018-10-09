package 成员内类的修饰符;

public class outer {
	private int num=10;
	private static int num2=20;
		 static class inner{
			public void show() {
				System.out.println(num2);//类被静态修饰以后访问的数据只能是静态的
			}
			public static void show2() {
				System.out.println(num2);
			}
		}

}
