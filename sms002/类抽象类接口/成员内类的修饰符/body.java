package 成员内类的修饰符;

public class body {
		private class  heart{
			public void operator() {
				System.out.println("这是心的呼唤");
			}
		}
		public void method() {
		//	boolean 满足条件 = false;
			//if(满足条件) {
				heart h=new heart();
				h.operator();
			
		}
}
