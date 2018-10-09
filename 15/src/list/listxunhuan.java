package list;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;

public class listxunhuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add("java");
		list.add("mensionyu");
		for(int x=0;x<list.size();x++) {
			String s=(String) list.get(x);
			System.out.println(s);
		}
		Iterator it=list.iterator();
		ListIterator lit= list.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
//		}
//		
//		while(lit.hasPrevious()) {
//			System.out.println(lit.previous());
//		}
//		while(lit.hasNext()) {//迭代器遍历，迭代器修改修改
//			String s=(String)lit.next();
//			if("mensionyu".equals(s))
//				lit.add("oosehun");
//			//System.out.println(lit.next();
//		}
		//集合遍历，集合修改
		for(int i=0;i<list.size();i++) {
			String s=(String)list.get(i);
					if("mensionyu".equals(s))
						list.add(list.size(),"oosehun");
		}
		System.out.println("list"+list);
	}

	}}
