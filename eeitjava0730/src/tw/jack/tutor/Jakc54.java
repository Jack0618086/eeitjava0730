package tw.jack.tutor;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Jakc54 {

	public static void main(String[] args) {
		byte[] buf = new byte [4*1024];
		try {
			DatagramSocket socket = new DatagramSocket(8888);
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			System.out.println("before");
			socket.receive(packet);
			System.out.println("after");
			socket.close();
			
			String urIp = packet.getAddress().getHostAddress();
			byte[] data = packet.getData();
			int len = packet.getLength();
			String mesg = new String(buf,0,len);			
			System.out.println("Receive OK");
			System.out.printf("%s => %s\n", urIp, mesg);
		
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
// wileframe