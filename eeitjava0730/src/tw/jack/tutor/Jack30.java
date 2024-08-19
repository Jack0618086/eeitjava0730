package tw.jack.tutor;

import java.util.LinkedList;
import java.util.List;

public class Jack30 {

	public static void main(String[] args) {
		List list = new LinkedList();
		list.add("Jack");
		list.add(123);
		list.add(1, 12.3);
		list.add(true);
		list.add(123);
		list.add("Jack");
		System.out.println(list.size());
		System.out.println("---");
		for (Object obj : list ) {
			System.out.println(obj);
		}
	
	}

}
