package tw.jack.tutor;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Jack55 {

	public static void main(String[] args) {
		File source = new File("dir1/cofee.jpg");
		try (	BufferedInputStream bin = new BufferedInputStream(new FileInputStream(source));
				Socket client = new Socket(InetAddress.getByName("10.0.100.157"), 9999);
				BufferedOutputStream bout = new BufferedOutputStream(client.getOutputStream())) {

			byte[] buf = new byte[(int)source.length()];
			bin.read(buf);
			bout.write(buf);
			
			
//			String mesg = "Hello World\nabcdefg\n1234567\n";
//			bout.write(mesg.getBytes());


			System.out.println("Send OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}