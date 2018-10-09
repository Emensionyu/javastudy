package sms002;
import java.util.Scanner;;

public class maxin3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int max=getmax(a,b,c);
		System.out.println(max);
		
	}
	

	public static int getmax(int a,int b,int c) {
		
		// TODO Auto-generated method stub
		int max;
		if(a>b) {
			return (a>c?a:c);//return(a>b)?(a>c?a:c):(b>c?b:c);
		}else {				//int temp=(a>b?a:b);
							//int max=(temp>c?temp:c);return max;
			return(b>c?b:c);
		}
		

	}

}
