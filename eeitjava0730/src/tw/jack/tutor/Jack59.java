package tw.jack.tutor;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Jack59 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fout = new FileOutputStream("dir2/yahoo.jpg");
			
			URL url = new URL("https://pgw.udn.com.tw/gw/photo.php?u=https://uc.udn.com.tw/photo/2024/08/11/0/30247520.jpg&x=0&y=0&sw=0&sh=0&exp=3600");
			URLConnection conn = url.openConnection();
			BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());
			
			
			byte[] buf = new byte[4*1024]; int len;
			while ((len = bin.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
			bin.close();
			
			fout.flush();
			fout.close();
			System.out.println("OK");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
