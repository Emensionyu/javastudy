package สýื้;

public class shuzupaixu {
	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1};
		maopao(arr);
		System.out.println("---------------------");
		reverse(arr); 
	}
	

	public static void maopao(int[]arr) {
		// TODO Auto-generated method stub
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<(arr.length-i);j++) {
				if(arr[i]<arr[j]) {
					int t=arr[j];
					arr[j]=arr[i];
					arr[i]=t;
				}
			}
		}
		for(int j=0;j<arr.length;j++) {
		System.out.println(arr[j]);
	}

	}
	public static void reverse(int[]arr) {
		for(int i=0;i<(arr.length)/2;i++) {
			int t=arr[i];
			arr[i]=arr[(arr.length-1-i)];	}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
}
