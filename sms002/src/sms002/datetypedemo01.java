package sms002;

public class datetypedemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f1=100.0f;
		byte b1=80;
		char c='o';
		String s1="123";
		f1=(int)f1<<2;
		b1=(byte)(b1<<2);
		//s1=s1<<2;
		c=(char)(c<<2);//位运算符的操作数只能是整形和字符型
		System.out.println(f1);
		System.out.println(b1);
		System.out.println(c);
	}

}
