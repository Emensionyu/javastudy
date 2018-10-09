package 类;
/*匿名对象;就是没有名字的对象
 * 匿名对象的应用场景：仅仅只调用一次的时候
 * 	注意：多次调用的时候不合适。匿名对象调用完毕就是垃圾，可以被垃圾回收其回收
 * B：匿名对象可以做实际参数传递
 * 
 
 */
public class nonamedome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentdemo sd=new studentdemo();
		student s1=new student();
		new student().show();
		sd.method(s1);
		sd.method(new student());
		new studentdemo().method(new student());
       
	}

}
