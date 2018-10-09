package 数组;

public class destinguish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x=new int[100];//只要看到牛就是为数组分配内存空间，数组的地址赋值给x
		int y[]=new int[2];
		x=y;
	
	x[1]=100;

	    System.out.println(x[1]);
		System.out.println(y[1]);
		
	}

}

