package tw.jack.tutor;

import java.util.Random;

import tw.jack.apis.TWID;

public class Jack17 {

	public static void main(String[] args) {
//		System.out.println(TWID.isRight("陳"));
//		System.out.println(TWID.isRight("L123456789")); // True
//		
//		Random rand = new Random();
//		System.out.println(rand.nextInt(1, 7)); // 隨機選號
//		System.out.println(rand.nextInt(2)); // 隨機產生男女
		
		TWID id1 = new TWID(); // 完全隨機
		TWID id2 = new TWID(false);
		TWID id3 = new TWID('B');
		TWID id4 = new TWID(true, 'Y');
		TWID id5 = TWID.newTWID("Y120239847");
		
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
		System.out.println(id5.getId());

	}

}
