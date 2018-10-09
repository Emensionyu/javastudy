package สýื้;

public class secret {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=123456;
		int[] arr=new int[8];
		int index=0;
		while(number>0) {
			arr[index]=number%10;
			index++;
			number=number/10;
		}
for(int x=0;x<index;x++) {
	System.out.print(arr[x]);
}
	}

}
