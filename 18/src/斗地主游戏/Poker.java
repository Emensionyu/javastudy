package 斗地主游戏;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Poker {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> array=new ArrayList<Integer>();
		String[] colors= {"♣","♠","❤","■"};
	    String[] numbers= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	    HashMap<Integer,String> hm=new HashMap<Integer,String>();
	    int index=0;
	    for(String number:numbers) {
	    	for(String color:colors) {
	    		hm.put(index, color.concat(number));
	    		array.add(index);
	    		index++;
	    	}
	    }
		hm.put(index,"大王");
		index++;
		hm.put(index,"小王");
		
		TreeSet<Integer> mensionyu1 =new TreeSet<Integer>();
		TreeSet<Integer> mensionyu2 =new TreeSet<Integer>();
		TreeSet<Integer> mensionyu3 =new TreeSet<Integer>();
		TreeSet<Integer> dipai =new TreeSet<Integer>();
		for(int i=0;i<array.size();i++) {
			if (i>array.size()-3)
				dipai.add(array.get(i));
			if(i%3==0) {
				mensionyu1.add(array.get(i));
				
			}
		if(i%3==1) {
			mensionyu2.add(array.get(i));
			
		}
		if(i%3==2) {
			mensionyu3.add(array.get(i));
			
		
		}
		lookpoker(mensionyu,mensionyu1,hm);
		public static void lookpoker(String name,TreeSet<Integer> tr,HashMap<Integer,String> hm1) 
		{
			System.out.println(name+"的牌是");
			for(Integer Key:tr)
				String Object key;
				value=hm1.get(key);
			System.out.prinn(value);
		}
		System.out.println(".");

			
			
			
		}
		Collections.shuffle(array);
		System.out.println(array);
		
		

	}

}
