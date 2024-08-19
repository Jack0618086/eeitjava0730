package tw.jack.tutor;

public class Jack62 {

	public static void main(String[] args) {
		MyThread mt1 = new MyThread("A");
		MyThread mt2 = new MyThread("B");
		MyRunnabl mr1 = new MyRunnabl("C");
		Thread t1 = new Thread(mr1);
		
		mt1.start();
		mt2.start();
		t1.start();
		
		System.out.println("OK");

	}
}

class MyThread extends Thread {
	private String name;
	
	public MyThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i=0; i<20; i++) {
			System.out.printf("%s : %d\n", name, i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}

class MyRunnabl implements Runnable {
	private String name;
	
	public MyRunnabl(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i=0; i<20; i++) {
			System.out.printf("%s : %d\n", name, i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}