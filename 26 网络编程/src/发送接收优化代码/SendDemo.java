package 发送接收优化代码;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class SendDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket ds=new DatagramSocket() ;
		String s=null;
		while(s!="byebye") {
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		byte[] bys=s.getBytes();
		
		DatagramPacket dp=new DatagramPacket(bys,bys.length,InetAddress.getByName("192.168.1.101"),12345);
	    ds.send(dp);
	    
	}
		ds.close();
}}
