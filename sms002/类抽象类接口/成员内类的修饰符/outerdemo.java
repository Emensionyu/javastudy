package ��Ա��������η�;

public class outerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//outer.inner oi=new outer().new inner();//����ͨ�����ַ�ʽ����
		outer.inner oi=new outer.inner();
		oi.show();
		oi.show2();
		outer.inner.show2();

	}

}
