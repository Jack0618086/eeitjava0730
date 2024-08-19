package tw.jack.tutor;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.SocketException;

public class Jack53 {

	public static void main(String[] args) {
		String mesg = "Hello, Jack";
		byte[] mesBuf =mesg.getBytes();
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet= new DatagramPacket(mesBuf, mesBuf.length, 
					InetAddress.getByName("10.0.100.184"), 8888);
			socket.send(packet);
			socket.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
