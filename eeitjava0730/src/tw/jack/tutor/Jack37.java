package tw.jack.tutor;

public class Jack37 {
	public static void main(String[] args) {
		Jack371 obj = new Jack371();
		try {
			obj.m1();			
		} catch (Exception e) {
		}
	}
}

class Jack371 {
	void m1() throws Exception {
		System.out.println("Jack371:m1()");
		m2();
	}
	void m2() throws Exception {
		System.out.println("Jack371:m2()");
		m3();			
	}
	void m3() throws Exception{
		System.out.println("Jack371:m3()");
		throw new Exception();
		}
}