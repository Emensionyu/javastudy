package ×Ö·û´®ÅÅÐò;

public class Strpaixu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="dcba";
		char[] arr=s.toCharArray();
		for(int i=0;i<arr.length-1;i++) {
			
		
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
		}
		String s2="";
		for(int k=0;k<arr.length;k++) {
			s2+=arr[k];
		}
		String s3=String.valueOf(arr);
System.out.println(s2);
	}

}
