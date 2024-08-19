package tw.jack.tutor;

public class Jack06 {

	public static void main(String[] args) {
		int i = 0;
		for (printJack(); i<10 ; printLine()) {
			System.out.println(i++);
		}
		//		System.out.println("-----");
		System.out.println(i);
	}

	static void printJack() {
		System.out.println("Jack");
		printLine();
	}
	static void printLine() {
		System.out.println("---");
	}
}