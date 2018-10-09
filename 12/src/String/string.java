package String;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		s="world";
        //s+="world";
		System.out.println(s+"s.length()"+s.length());

	System.out.println("-----------------");
		
		String s1=new String("osehun");
		String s2="oosehun";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
	System.out.println("-----------------");
	
		String s11="hello@";
		String s22="world@";
		String s33="hello@world@";
		System.out.println(s33.equals("hello@"+"world@"));
		System.out.println(s33.equals(s11+s22));
		
		
	
	
}}
