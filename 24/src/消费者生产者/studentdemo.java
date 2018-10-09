package 消费者生产者;

public class studentdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student();
		setthread s1=new setthread(s);
		getthread s2=new getthread(s);
		Thread my1=new Thread(s1);
		Thread my2=new Thread(s2);
		my1.start();
		my2.start();
		
		

	}

}
