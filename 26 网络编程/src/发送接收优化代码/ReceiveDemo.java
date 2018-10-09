package 发送接收优化代码;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiveDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket ds=new DatagramSocket(12345) ;
		while(true) {
			
		
		byte[]  bys=new byte[1024];
		DatagramPacket dp=new DatagramPacket(bys,bys.length);
		ds.receive(dp);
		InetAddress address=dp.getAddress();
		String ip=address.getHostAddress();
		byte[] bys2=dp.getData();
		String s=new String(bys2,0,bys2.length);
		System.out.println("from"+ip+"他刚才说"+s);
	}
	}

}
