package trycatch;

public class teacher {

	public void check(int score) throws myexception {

		if (score<0||score>100) {
			throw  new myexception("������0-100֮��");
			}
		else {System.out.println("����û������");
			}
		

	}

}
