package �ļ���ȡ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class �ļ����� {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream in=new FileInputStream("C:\\Users\\����l\\Desktop\\1.jpg");
		FileOutputStream out=new FileOutputStream("1.jpg");
		int index=0;
		while((index=in.read())!=-1) {
			out.write(index);
		}
		in.close();
		out.close();

	}

}
