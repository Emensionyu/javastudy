package �����ȡ��Ա����;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class ͨ���������������ļ����� {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		FileReader fr=new FileReader("class.txt");
		prop.load(fr);
		fr.close();
		String classname=prop.getProperty("className");
		String methodName=prop.getProperty("methodName");
		
		Class c=Class.forName("classanme");
		Constructor con =c.getConstructor();
		Object obj=con.newInstance();
		Method m=c.getMethod(methodName);
		m.invoke(obj);
		
	
	}

}
