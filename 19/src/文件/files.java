package нд╪Ч;

import java.io.File;
import java.io.IOException;

public class files {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file1=new File("F:\\mensionyu");
		file1.mkdir();
		File file2=new File("F:\\mensionyu\\a.txt");
		file2.createNewFile();
		File file3=new File("F:\\oosehun\\b.txt");
		file3.mkdirs();
		File f1=new File("2.txt");
		f1.createNewFile();
		File f2=new File("oosehun.txt");
		f1.renameTo(f2);
	}

}
