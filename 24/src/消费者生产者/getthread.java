package ������������;

public class getthread implements Runnable {
	private student s;
	public getthread(student s) {
		this.s=s;
	}
	public void run() {
		while(true) {
			synchronized(s) {
				s.get();
		}
			
		}
		
}
}