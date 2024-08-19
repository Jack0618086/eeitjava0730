package tw.jack.tutor;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Jack32 {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "Jack");
		map.put("age", 18);
		map.put("gender", true);
		map.put("weight", 80.1);
		System.out.println(map.get("age"));
		System.out.println("---");
		Set<String> keys = map.keySet();
		for (String Key : keys) {
			System.out.printf("%s => %s\n", Key,map.get(Key));
		}
		
		System.out.println(File.pathSeparator); // ; 分號
		System.out.println(File.separator); // \

	}

}
