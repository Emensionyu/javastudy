package 继承;

class son extends father{//加载子类先加载父类。静态代码块会随着父类的加载而加载，然后再加载子类的静态代码块
	int num=20;
	static {
		System.out.println("吴世勋欧巴2018年大发");
	}
	{
		System.out.println("希望·吴世勋2018年快快乐乐，继续做行走的荷尔蒙哇塞");//构造代码块也会被加载，并且在在构造方法钱加载
	}
	public son(String name) {        //有参构造方法
		//super();是默认的
		super("吴世勋");//要放在第一行只能出现一次，不能多次对父类进行初始化。只要访问父类构造，就能对父类数据初始化 
		System.out.println("你好啊");
	}
	public son() {            //无参构造方法
		this("吴世勋");
		System.out.println("子类的无参构造被调用了");
	}
	public void show() {
		System.out.println(super.age);//super 代表父类存储空间的标识
	}
}
