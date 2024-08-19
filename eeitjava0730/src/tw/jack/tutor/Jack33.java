package tw.jack.tutor;

import java.io.File;

public class Jack33 {

	public static void main(String[] args) {
		File f1 =new File("d:/dir2");
		File f2 =new File("d:/test1");
		if (f1.exists()) {
			System.out.println("ok");
		}else {
			System.out.println("XX");
			if (f1.mkdir()) {
			System.out.println("OK2");
			}else {
				System.out.println("XX");
			}
		}

		File nowDir = new File("."); // 代表現在所在的資料夾
		System.out.println(nowDir.getAbsolutePath());
	}

}
