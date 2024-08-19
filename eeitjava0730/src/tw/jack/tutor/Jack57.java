package tw.jack.tutor;

import java.net.ServerSocket;
import java.net.Socket;

public class Jack57 {

	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(9487);
				Socket socket = server.accept();
				) {
			System.out.println("OK");
		} catch (Exception e) {
			
		}
	}

}
