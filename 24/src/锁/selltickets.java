package ��;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class selltickets implements Runnable {
	private int ticket=1000;
	private Lock lock=new ReentrantLock();
	public void run() {
		while(true) {
			try {
				lock.lock();
				if(ticket>0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				System.out.println(Thread.currentThread().getName()+"�ڳ���"+ticket--+"��Ʊ");
				}
			}finally {
			lock.unlock();
		}
		}
	}

}
