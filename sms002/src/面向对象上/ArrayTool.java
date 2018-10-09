package 面向对象上;

public class ArrayTool {
private ArrayTool() {
	
}
public static void printArray(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		if(i==arr.length-1) {
			System.out.println(arr[i]);
		}
		else {
			System.out.println(arr[i]+",");
		}
	}
}
public static int getindex(int[] arr,int value) {
	int index=-1;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==value) {
			index=i;
		    break; 
	}
		//else index++;
}
	return index;
}
}