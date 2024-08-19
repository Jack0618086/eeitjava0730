package tw.jack.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

import tw.jack.apis.Student;

public class Jack50 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("dir1/Jack.score");
			ObjectInputStream oin = new ObjectInputStream(fin);
			
			Object obj = oin.readObject();
			Student s1 = (Student)obj;
			System.out.println(s1);
			System.out.println(s1.sum());
			System.out.println(s1.avg());
			
			oin.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
