package tw.jack.tutor;

public class Jack99 {

	public static void main(String[] args) {
		final int ROWS = 1;	// 要分成幾列
		final int COLS = 9;	// 1-9 99乘法表
		final int START = 1;	// 從1開始

		for (int k=0; k<ROWS; k++) {
			for(int j=1; j<=9; j++) {
				for(int i=START; i<START+COLS; i++) {
					int newi = i + k*COLS;
					int r = newi * j;
					System.out.printf("%d x %d = %d\t", newi, j, r);
				}
				System.out.println();
			}
			System.out.println("----");
		}
	}
}