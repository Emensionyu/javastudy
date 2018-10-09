package 分割规则;

public class 字符串转为int数组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s= "12 13 14 15";
			 String regex=" ";
			String[] str=s.split(regex);
			int[] arr=new int[str.length];
			for(int i=0;i<arr.length;i++) {
				arr[i]=Integer.parseInt(str[i]);				
			}
	}

}
