package ��ʱ��;

import java.util.Timer;
import java.util.TimerTask;

public class mytask extends TimerTask{
	private Timer t;
	public mytask() {};
	public mytask(Timer t) {
		this.t=t;
}
	public void run() {
		System.out.println("���ܰ�");
		t.cancel();
	}

}
