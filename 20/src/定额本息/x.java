package 定额本息;

public class x {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=60000;
		float p=(float) 0.01;
	
		float[] s1=new float[300];
		s1[0]=(float)((float)A/300+(float)A*p);
		float sum=s1[0];
		for(int i=1;i<300;i++) {
			 
			s1[i]=(float)(A/300+(A-(A/300)*i)*p);
			
			
		}
		
		for(int j=0;j<300;j++) {
			
				if((j+1)%30==0) {System.out.println("");}
				System.out.print(j+1+"期应还"+":");
				System.out.print(s1[j]+"\t");
			}

	}

}
