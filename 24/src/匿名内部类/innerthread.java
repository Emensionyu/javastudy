package 匿名内部类;

public class innerthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			public void run() {
				for(int x=0;x<10;x++) {
					System.out.println(Thread.currentThread().getName()+":"+x);
				}
			}
			
		}) {}.start();

}}
