package 多线程实现聊天室程序;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.SocketException;

public class chatroom {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket dssend=new DatagramSocket() ;
		DatagramSocket dsreceive=new DatagramSocket(12346) ;
		SendThread st=new SendThread(dssend);
		ReceiveThread rt=new ReceiveThread(dsreceive);
		Thread my1=new  Thread(st);
		Thread my2=new  Thread(rt);
		
		my1.start();
		my2.start();

	}

}
