package Ïß³ÌÐÝÃß;

import java.util.Date;

public class Threadsleep extends Thread{
	public Threadsleep() {}
	public Threadsleep(String name) {
		super(name);
	}
	
	
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(getName()+":"+i+new Date());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
