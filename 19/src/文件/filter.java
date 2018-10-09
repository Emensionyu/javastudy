package нд╪Ч;

import java.io.File;

public class filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("F:\\oosehun");
		File[] arr=f.listFiles();
		for(File ff:arr) {
			if(ff.isFile()) {
				if(ff.getName().endsWith(".jpg"))
					System.out.println(ff.getName());
			}
				
		}
		

	}

}
