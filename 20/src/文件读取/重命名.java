package 文件读取;

import java.io.File;

public class 重命名 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File("1.jpg");
		File f2=new File("输出流异常处理标准代码.jpg");
		f1.renameTo(f2);
		
		

	}

}
