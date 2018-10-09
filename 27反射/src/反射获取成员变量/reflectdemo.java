package 反射获取成员变量;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class reflectdemo {
public static void main(String[] args) throws Exception {
	Class c=Class.forName("反射获取成员变量.students");
	Constructor con =c.getConstructor();
	Object obj=con.newInstance();
	Field namefield=c.getField("name");
	namefield.set(obj, "wangjiawei");
	System.out.println(obj);
	
	
	
	
}
}
