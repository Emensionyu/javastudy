package ¸´ÖÆÒôÀÖ;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class musiccopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedInputStream yuan=new BufferedInputStream(new FileInputStream("C:\\Users\\µÄÁ³l\\Music\\ÐÇµÜ\\ÕæµÄ°®Äã.mp3"));
		BufferedOutputStream yuancopy=new BufferedOutputStream(new FileOutputStream("love you.mp3"));
		byte[] bys=new byte[1024];
		int len=0;
		while ((len=yuan.read(bys))!=-1) {
			yuancopy.write(bys,0,len);
		}
		yuan.close();
		yuancopy.close();
	}

}
