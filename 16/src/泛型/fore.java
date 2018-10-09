package ·ºÐÍ;

import java.util.ArrayList;
import java.util.Iterator;
import java.lang.String;

public class fore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("happy");
		arr.add("erery");
		arr.add("night");
//		for(String s:arr) {
//			if("erery".equals(s))
//				arr.add("morning");
//			
//		}
	for(int x=0;x<arr.size();x++) {
		String f=arr.get(x);
		System.out.println(f);
	}
		Iterator it=arr.iterator();
		while(it.hasNext());
		{
			String d=(String)it.next();
			System.out.println(d);
		}
////		System.out.println(arr);
//		
	}

}
