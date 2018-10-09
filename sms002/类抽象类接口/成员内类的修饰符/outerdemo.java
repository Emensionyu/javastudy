package 成员内类的修饰符;

public class outerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//outer.inner oi=new outer().new inner();//不能通过这种方式访问
		outer.inner oi=new outer.inner();
		oi.show();
		oi.show2();
		outer.inner.show2();

	}

}
