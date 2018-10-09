package 消费者生产者;

public class student {
private int age;
 private String name;
 private boolean flag;
 
 
 
 public synchronized void set(String name,int age) {
	 if(this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	 this.name=name;
	 this.age=age;
	 this.flag=true ;
	 this.notify();
 }
 public synchronized void get() {
	 if(!this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	 System.out.println(this.name+this.age);
	 this.flag=true;
	 this.notify();
	 
 }
}
	