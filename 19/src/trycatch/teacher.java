package trycatch;

public class teacher {

	public void check(int score) throws myexception {

		if (score<0||score>100) {
			throw  new myexception("分数在0-100之间");
			}
		else {System.out.println("分数没有问题");
			}
		

	}

}
