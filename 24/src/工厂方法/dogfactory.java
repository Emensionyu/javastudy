package ��������;

public class dogfactory implements factory {

	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		return new dog();
	}

}
