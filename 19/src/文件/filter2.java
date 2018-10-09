package нд╪Ч;

import java.io.File;
import java.io.FilenameFilter;

public class filter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("F:\\oosehun");
		String[] arr=f.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				
				return new File(dir,name).isFile()&&name.endsWith(".jpg");}
			
		});
	
		for(String s:arr) {
			System.out.println(s);
		}
		
	}

}
