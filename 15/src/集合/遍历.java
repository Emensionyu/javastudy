package ¼¯ºÏ;
import java.util.ArrayList;
import java.util.Collection;
public class ±éÀú {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c1=new ArrayList();
		c1.add("hello");
		c1.add("word");
		Object[] obj=c1.toArray();
		for(int i=0;i<obj.length;i++) {
			String s=(String)obj[i];
			System.out.println(s+"-----"+s.length());
		}

	}

}
