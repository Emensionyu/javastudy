package 集合;

import java.util.ArrayList;
import java.util.Collection;

public class 创建 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		/**
		 * boolean addAll(collect c);添加一个元素
		 * boolean retainAll(Collect c)做交集
		 * 假设A B做交集
		 * A对B做交集，最终结果保存在A中
		 * 返回值表示的是A是否发生改变
		 * 
		 */
		Collection c1=new ArrayList();
		c1.add("a");
		Collection c2=new ArrayList();
		c2.add("b");
		c1.addAll(c2);
		System.out.println("c1"+c1);
		
	}

}
