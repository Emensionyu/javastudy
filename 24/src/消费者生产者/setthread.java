package ������������;

public class setthread implements Runnable {
	private student s;
	private int x=0;
	public setthread(student s) {
		this.s=s;
	}
	public void run() {
		while(true) {
			
			synchronized(s) {
				
			if(x%2==0) {
				s.set("����ϼ", 520);
				
				
			}
			else {
				s.set("������", 20);
				
			}
			x++;
			
		}
			
	}

}
}
