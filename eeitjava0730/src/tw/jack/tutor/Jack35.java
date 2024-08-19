package tw.jack.tutor;

public class Jack35 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		int[]d = {0,1,2,3};
		
		try {
			int c = a / b;
			System.out.println(c);
			System.out.println(d[12]);
		}catch (ArithmeticException e) {
			System.out.println("Err"); // 如果出錯印出err
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Err2"); // 如果出錯印出err2
		}catch (RuntimeException e) {
			System.out.println("err3");
		}
		System.out.println("ok");
	}

}
