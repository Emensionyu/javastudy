package Stringbuff;

public class arrto {
	public static void main(String args[]) {
		int[]arr= {3,2,1};
		StringBuffer sb=new StringBuffer();
		sb.append('{');
		/*for(int i=0;i<arr.length;i++) {
			if()
			
		}*/
		String s="happy new year";
		StringBuffer s3=new StringBuffer(s);
		System.out.println(s3.append(s).reverse());
		System.out.println(new StringBuffer(s).reverse().toString()); 
		
		
	}

}
