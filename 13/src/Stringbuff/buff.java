package Stringbuff;

public class buff {
	public static void main(String args[]) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb);
		String s="hello";
		StringBuffer sbb=new StringBuffer();
		StringBuffer sb2=new StringBuffer(s);
		StringBuffer sb3=sbb.append(s);
		System.out.println("--------");
		
			StringBuffer sb4=new StringBuffer("java");
			String Str=new String(sb4);
			String str2=sb4.toString();
			System.out.println(Str);
			System.out.println(str2);
		
	}
	

}
