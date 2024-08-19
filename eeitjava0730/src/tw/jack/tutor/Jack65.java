package tw.jack.tutor;

public class Jack65 {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {
		}
		
		System.out.println("Main FINISH");
	}
}
class Thread1 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread1 start working...");
		
		try {
			Thread.sleep(3*1000);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread1 FINISH!");
	}
}
class Thread2 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread2 start working...");
		try {
			Thread.sleep(3*1000);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread2 FINISH!");
	}
}