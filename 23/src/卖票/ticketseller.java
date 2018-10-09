package 卖票;

public class ticketseller implements Runnable {
	private int ticket=10;
	 private Object obj=new Object();
	 private int x=0;
	public void run() {
		while(true) {
			{
				if(x%2==0) {
					synchronized(this) {
						if(ticket>0) {
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						
							System.out.println(Thread.currentThread().getName()+"在出售"+ticket--+"张票");
						
					}
				}
			}
				else {	
					selltickets();
					
				}
			
				
			
			}
		}
		
	}
		private synchronized void selltickets() {
			if(ticket>0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				System.out.println(Thread.currentThread().getName()+"在出售"+ticket--+"张票");
			
		}

}
}
