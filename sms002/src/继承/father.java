package 继承;

public class father {
	int age=48;
	static {
		System.out.println("2018年你想对吴先生说点什么");
	}
	{
		System.out.println("你还想对吴先生说什么");//构造代码块
	}
	public father(String name) {     //构造方法
		System.out.println("我是吴先生");
	}

}
 