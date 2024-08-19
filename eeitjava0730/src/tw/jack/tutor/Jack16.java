package tw.jack.tutor;

import tw.jack.apis.Bike;

public class Jack16 {

	public static void main(String[] args) {
		String s1 = new String();
		System.out.println(s1.length());
		
		byte[]b1 = {97,98,99,100};
		String s2 = new String(b1);
		System.out.println(s2.length());
		System.out.println(s2);
		
		Bike b2 = new Bike();
		System.out.println(b2);
		
		int c = 12;
		System.out.println(c);
		
		Object obj1 = new Object();
		System.out.println(obj1);
		
		
		String s3 = "Jack";
		System.out.println(s3);
		String s4 = "Jack";
		String s5 = new String("Jack");
		String s6 = new String("Jack");
		System.out.println(s3 == s4);
		System.out.println(s3 == s5);
		System.out.println(s5 == s6);
		
		System.out.println("Jack".charAt(3)); // 雙引號就是字串物件
		
		System.out.println(s3.concat("chen")); // print出來是 JackChen 
	}
}