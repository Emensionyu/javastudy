package 文件读取;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class 字节数组 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in=new FileInputStream("fos.txt");
		//byte[] bys=new byte[5];
		int len=0;
		while((len=in.read())!=-1) {
			//System.out.print(new String(bys,0,len));
			System.out.print((char)len);
		}
		
		in.close();
	}

}
