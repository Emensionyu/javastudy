package 工厂方法;

public class dogfactory implements factory {

	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		return new dog();
	}

}
