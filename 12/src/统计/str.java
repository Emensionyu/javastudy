package Í³¼Æ;

public class str {
	public static void main(String[]ags) {
		String s="ABCabc123";
		int dxnumber=0;
		int xxnumber=0;
		int sznumber=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>0&&s.charAt(i)<9) {
				sznumber++;}
			else if(s.charAt(i)>'a'&&s.charAt(i)<'z') {
				xxnumber++;}
			else if(s.charAt(i)>'A'&&s.charAt(i)<'Z') {
				dxnumber++;}
		
	}
		System.out.println(dxnumber+","+xxnumber+","+sznumber);
}
}