package tw.jack.tutor;

import java.io.FileReader;

public class Jack45 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("./dir1/file2.txt");
			int c;
			while ((c = fr.read())!= -1) {
				System.out.print((char)c);
			}
			
			
			fr.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}