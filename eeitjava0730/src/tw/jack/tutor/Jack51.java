package tw.jack.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Jack51 {
	public static void main(String[] args) {
		Jack513 obj = new Jack513();
		
		try {
			ObjectOutputStream oout = new ObjectOutputStream(
					new FileOutputStream("dir1/test.ok"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("OK");
			System.out.println("--------");
			
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("dir1/test.ok"));
			oin.readObject();
			oin.close();
			System.out.println("OK2");
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
class Jack511  implements Serializable{
	Jack511(){System.out.println("Jack511()");}
}
class Jack512 extends Jack511{
	Jack512(){System.out.println("Jack512()");}
}
class Jack513 extends Jack512  {
	Jack513(){System.out.println("Jack513()");}
}