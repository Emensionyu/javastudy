package нд╪Ч;

import java.io.File;

public class Stringrename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("F:\\oosehun");
		File[] filearray=f.listFiles();
		for(File ff:filearray) {
			String name=ff.getName();
			String newname=name.substring(0,4);
			File newFile=new File(ff,newname);
			ff.renameTo(newFile);
		}
		
	}

}
