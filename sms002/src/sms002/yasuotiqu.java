package sms002;

public class yasuotiqu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a='e';char b='f';
		char c;char x; char y;
		///Ñ¹Ëõ
		c=b;
		char t=(char)(a<<8);
		c=(char)(c+t);
		System.out.println("c="+c);
		///½âÑ¹
		y=(char)(c& 0x00ff);
		x=(char)(c>>8);
		System.out.println("x="+x+",y="+y);

	}

}
