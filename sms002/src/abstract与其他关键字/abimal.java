package abstract与其他关键字;

 abstract class abimal {
	private int age;
		public abstract void show() ;
		//private abstract int num()；方法不能用private修饰
	//	final abstract String name();方法不能用final修饰
	// static abstract void me();静态可以通过类名访问。访问一个没有方法体的方法没有意义
		
		static  void method() {
			System.out.println("吴世勋");
		};
}
