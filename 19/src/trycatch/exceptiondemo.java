package trycatch;

public class exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("今晚夜色真好");
		//mathod2();
		
		//public static void method() throws ArithmeticException {
			int a=10;
			int b=0;
			try {
			System.out.println(a/b );}
			catch(ArithmeticException e){
				System.out.println("除数为零了");
			}
			
		System.out.println("可惜我不在你身边");
	
	}

//	private static void mathod2() throws  {
//		// TODO Auto-generated method stub
//		String str="mensionyu"
//		System.out.println(str);
//	}

}
