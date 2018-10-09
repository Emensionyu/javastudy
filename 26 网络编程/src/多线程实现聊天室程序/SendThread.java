package 多线程实现聊天室程序;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendThread implements Runnable {
	 private DatagramSocket ds;
	 public  SendThread() {}
	 public  SendThread(DatagramSocket s) {
		 this.ds=s;
	 }
	 
	 

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
		String s=null;
		while(s!="byebye") {
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		byte[] bys=s.getBytes();
		
		DatagramPacket dp=new DatagramPacket(bys,bys.length,InetAddress.getByName("192.168.1.101"),12345);
	    ds.send(dp);
	    
	}
		ds.close();

	}catch(IOException e) {
		e.printStackTrace();
	}
}}
