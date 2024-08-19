package tw.jack.tutor;

import java.util.Scanner;

public class Jack02 {

	public static void main(String[] args) {
		// input
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("X = ");
		int x = scanner.nextInt();
		
		System.out.print("Y = ");
		int y = scanner.nextInt();
		
		// operation
		int r1 = x + y;
		int r2 = x - y;
		int r3 = x * y;
		int r4 = x / y;
		int r5 = x % y;
		
		// output
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(r);
		System.out.printf("%d + %d = %d\n", x, y, r1);
		System.out.printf("%d + %d = %d\n", x, y, r2);
		System.out.printf("%d + %d = %d\n", x, y, r3);
		System.out.printf("%d + %d = %d........%d\n", x, y, r4, r5);
				
	}

}
