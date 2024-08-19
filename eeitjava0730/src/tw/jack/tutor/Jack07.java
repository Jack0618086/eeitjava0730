package tw.jack.tutor;

public class Jack07 {

	public static void main(String[] args) {
		int[] ary1;
		ary1 = new int[3]; // 陣列初始化，指定元素個數3個
		System.out.println(ary1[0]);
		System.out.println(ary1[1]);
		System.out.println(ary1[2]);
		System.out.println(ary1.length);
		System.out.println("----");
		ary1[1] = 100;
		ary1[2] = 200;
		//		ary1[300] = 300; // 大於等於0的整數就可以輸入
		for (int i=0; i<ary1.length; i++) {
			System.out.println(ary1[i]);
		}
		System.out.println("----");
		for (int v : ary1) {
			System.out.println(v);
		}
	}
}