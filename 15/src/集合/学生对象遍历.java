package ����;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ѧ��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c1=new ArrayList();
		student s1=new student("������",20);
		student s2=new student("����Ө",21);
		c1.add(s1);
		c1.add(s2);
		java.util.Iterator it=c1.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
				

	}

}
