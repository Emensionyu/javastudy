package Ã¶¾ÙÀà;

public abstract class directions {
	public static  final directions right=new directions("ÓÒ") {

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println(name);
			
		}
		
	};
	public static  final directions left=new directions("×ó") {
		public void show() {
			// TODO Auto-generated method stub
			System.out.println(name);
			
		}
	};
	
	private static String name;
	public directions(String name) {
		this.name=name;
	}
	public String getname() {
		return this.name;
	}
	public abstract void show();
	
}
