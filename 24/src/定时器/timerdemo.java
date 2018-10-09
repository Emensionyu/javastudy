package ¶¨Ê±Æ÷;

import java.util.Timer;

public class timerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer s=new Timer();
		s.schedule(new mytask(), 3000,2000);
		//s.Cancel();
	}

}
