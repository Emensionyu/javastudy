package 工厂方法;

public class factorydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factory f=new dogfactory();
		Animal d=f.createAnimal();
		d.eat();
		System.out.println();

	}

}
