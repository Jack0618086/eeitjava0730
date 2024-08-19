package tw.jack.tutor;

public class Jack10 {

	public static void main(String[] args) {
		int[][] a = new int[3][];
		a[0] = new int[2];
		a[1] = new int[3];
		a[2] = new int[4];
		// a有3個元素，用一維的關念去看
		for (int[] a1 : a) {
			for (int v : a1) {
				System.out.println(v + "");
			}
			System.out.println();
		}
	}
}