package 反射获取成员变量;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class 通过反射运行配置文件内容 {

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
