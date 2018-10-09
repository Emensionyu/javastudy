package 面向对象上;

public class Arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr= {22,23,24,25,26,27};
    ArrayTool.printArray(arr);
    int index=ArrayTool.getindex(arr ,23);
    System.out.println(index);

	}

}
