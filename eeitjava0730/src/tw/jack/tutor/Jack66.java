package tw.jack.tutor;

import org.mindrot.BCrypt;

public class Jack66 {

	public static void main(String[] args) {
		String passwd = "123456";
		String newpasswd = BCrypt.hashpw(passwd, BCrypt.gensalt());
		System.out.println(newpasswd); // 密碼加密
		System.out.println(newpasswd.length());
		if (BCrypt.checkpw("123456", newpasswd)) {
			System.out.println("OK");
		} else {
			System.out.println("XX");
		}
	}

}
