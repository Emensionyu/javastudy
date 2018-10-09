package ÎÄ¼þ¶ÁÈ¡;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fos=new FileInputStream("fos.txt");
		int by=0;
		while((by=fos.read())!=-1){
			System.out.print((char)by);
		}
		fos.close();

	}

}
