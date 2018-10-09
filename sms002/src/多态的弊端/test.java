package 多态的弊端;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fu fu=new zi();
	fu.show();
		zi zi=(zi)fu;//有错诶
        zi.method();
	}

}
//不能使用子类特有功能