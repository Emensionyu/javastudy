package ¶þ·Ö·¨;

public class part {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr ={1,2,3,6,7,8,9,};
		int min=0;
		int max=arr.length;
		int mid =(min+max)/2;
		int value=4;
		while(arr[mid]!=value) {
			if(arr[mid]<value) {
				min=mid+1;
			}
			if(arr[mid]>value) {
				max=mid-1;
			}
			if(min>max) {
				System.out.println("chucuo");
			}
			mid=(min+max)/2;
		}
		
	}

}
