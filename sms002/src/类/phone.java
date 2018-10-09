package 类;

public class phone {
	String name;
	int ixnhao;
	String color;
	public void call() {
		System.out.println("打电话");
	}
	public void message() {
		System.out.println("写信息");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone dageda=new phone();
		System.out.print(dageda.name+"------"+dageda.ixnhao+"-------"+dageda.color);
		dageda.name="老闵";
		dageda.ixnhao=9420;
		dageda.color="橙色";
		System.out.print(dageda.name+"------"+dageda.ixnhao+"-------"+dageda.color);
	    System.out.println(dageda);
	    phone dageda2=new phone();
	     dageda2=dageda;
	    dageda2.name="吴世勋";
	    dageda2.ixnhao=94;
	    dageda2.color="兰瑟";
	    System.out.print(dageda.name+"------"+dageda.ixnhao+"-------"+dageda.color);
	    
	}

}
