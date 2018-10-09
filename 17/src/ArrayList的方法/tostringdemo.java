package ArrayListµÄ·½·¨;
import java.util.*;
public class tostringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c=new ArrayList();
		c.add("i");
		c.add("am");
		c.add("beautiful");
		System.out.println(c);
		Object[] s=c.toArray();
		
		StringBuilder sb=new StringBuilder();
		sb.append("&&&");
		for(int x=0;x<s.length;x++) {
			sb.append(s[x]);
			sb.append("@");
			
		}
		sb.append("&&&");
		System.out.println(sb.toString());
		

	}
  
}
