package �����ȡ��Ա����;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class reflectdemo {
public static void main(String[] args) throws Exception {
	Class c=Class.forName("�����ȡ��Ա����.students");
	Constructor con =c.getConstructor();
	Object obj=con.newInstance();
	Field namefield=c.getField("name");
	namefield.set(obj, "wangjiawei");
	System.out.println(obj);
	
	
	
	
}
}
