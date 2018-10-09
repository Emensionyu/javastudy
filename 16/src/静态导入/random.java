package æ≤Ã¨µº»Î;

import java.util.ArrayList;
import java.util.Random;

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Random it=new Random();
      ArrayList<Integer> arr=new ArrayList<Integer>();
      int count=0;
      while(count<10) {
    	  int number=it.nextInt(20)+1;
    	  if(!arr.contains(number)) {
    		  arr.add(number);
    	  count++;}
      }
      for(Integer s:arr)
      System.out.println(s);
	}
	
}
