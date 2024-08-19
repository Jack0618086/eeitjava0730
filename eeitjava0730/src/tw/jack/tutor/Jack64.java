package tw.jack.tutor;

public class Jack64 {
	public static void main(String[] args) {
		Store store = new Store();
		producer p = new producer(store);
		Consumer c = new Consumer(store, "Jack");
		Consumer c1 = new Consumer(store, "Jack");
		Consumer c2 = new Consumer(store, "Jack");
		Consumer c3 = new Consumer(store, "Jack");
		p.start();
		c1.start();
		c2.start();
		c3.start();
	}
}
class Store {
	private int qty;
	private int max;
	Store(){
		max = 10; // max初始化
	}
	//新增方法
	synchronized void add(int add) throws InterruptedException {
		System.out.printf("準備進貨: %d\n", add);
		while (qty + add > max) {
			wait(); //無限期等候			
		}
		qty += add;
		System.out.printf("完成進貨: %d, 目前庫存: %d\n", add, qty);
		notify();
	}

	synchronized void buy (int buy, String name) throws InterruptedException {
		System.out.printf("%s想買: %d\n", name, buy);
		while (qty < buy) {
			wait(); //無限期等候			
		}
		qty -= buy;
		System.out.printf("完成賣出: %d(%s), 目前庫存: %d\n", buy, name, qty);
		notify();
	}
}
	class producer extends Thread{
		private Store store;
		public producer(Store store) {
			this.store = store;
		}
		@Override
		public void run() {
			for(int i =0; i<10; i++) {
				try {
					store.add(5);
					Thread.sleep(200);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		}
	}
	class Consumer extends Thread {
		private Store store;
		private String name;
		public Consumer(Store store, String name) {
			this.store = store;
			this.name = name;
		}

		@Override
		public void run() {
			for(int i =0; i<10; i++) {
				try {
					store.buy((int)(Math.random()*3)+1, name);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		}
	}