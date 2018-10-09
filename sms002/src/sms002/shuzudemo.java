package sms002;

public class shuzudemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[];
		int[] t=new int[10];
		int[] a=new int[5];
		System.out.println(t);
		System.out.println(a);
		/*t=a;
		for(int i=0;i<10;i++) {
			System.out.println(t[i]);
		}*/
		c=null;
		System.out.println("c="+c);
		c=t;
		t=a;
		a[0]=100;
		System.out.println(c);
		System.out.println(t);
		System.out.println(a[0]);
	}

}
