package ����;

import java.util.ArrayList;
import java.util.Collection;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		/**
		 * boolean addAll(collect c);���һ��Ԫ��
		 * boolean retainAll(Collect c)������
		 * ����A B������
		 * A��B�����������ս��������A��
		 * ����ֵ��ʾ����A�Ƿ����ı�
		 * 
		 */
		Collection c1=new ArrayList();
		c1.add("a");
		Collection c2=new ArrayList();
		c2.add("b");
		c1.addAll(c2);
		System.out.println("c1"+c1);
		
	}

}
