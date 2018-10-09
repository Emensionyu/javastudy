package ¥Û¥Æ≤È–°¥Æ;

public class getcount {
		public static int getcount(String s1,String s2) {
		int count=0;
		int index;
		while((index=s1.indexOf(s2))!=-1) {
			count++;
			s1=s1.substring((index+s2.length()));
			index=s1.indexOf(s2);
		}
		return count;
		}

}
