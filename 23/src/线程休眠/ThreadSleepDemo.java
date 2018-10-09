package 线程休眠;

public class ThreadSleepDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadsleep s1=new Threadsleep("林青霞");
		Threadsleep s2=new Threadsleep("东方不败");
		s1.start();
		s2.start();

	}

}
