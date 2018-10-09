package 类名作为返回值;

public class studebttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentdemo sb=new studentdemo();
		studebt  s=sb.method();//返回值类型是类类型，真正返回的是该类的实例对象
		s.study();
		}

}
