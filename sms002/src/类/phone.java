package ��;

public class phone {
	String name;
	int ixnhao;
	String color;
	public void call() {
		System.out.println("��绰");
	}
	public void message() {
		System.out.println("д��Ϣ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone dageda=new phone();
		System.out.print(dageda.name+"------"+dageda.ixnhao+"-------"+dageda.color);
		dageda.name="����";
		dageda.ixnhao=9420;
		dageda.color="��ɫ";
		System.out.print(dageda.name+"------"+dageda.ixnhao+"-------"+dageda.color);
	    System.out.println(dageda);
	    phone dageda2=new phone();
	     dageda2=dageda;
	    dageda2.name="����ѫ";
	    dageda2.ixnhao=94;
	    dageda2.color="��ɪ";
	    System.out.print(dageda.name+"------"+dageda.ixnhao+"-------"+dageda.color);
	    
	}

}
