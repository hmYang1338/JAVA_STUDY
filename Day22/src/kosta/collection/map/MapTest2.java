package kosta.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest2 {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 1);
		map.put("E", 5);
		
		
		// 키만
		Iterator<String> it0 = map.keySet().iterator();
		while(it0.hasNext()){
			System.out.println(it0.next());
		}

		
		
		//		Set<String> keySet = map.keySet();
		//		Iterator<String> it0 = keySet.iterator();
		// (키, 값) / 방법 1
		Iterator<String> it = map.keySet().iterator();
		while(it0.hasNext()){
			String key = it.next();	// key
			int value = map.get(key);	// value
			System.out.println(key +"=" +value);
		}
		System.out.println();
		
		// (키, 값) / 방법 2
		Iterator<Entry<String, Integer>> it2 = map.entrySet().iterator();
		while(it.hasNext()){
			Entry<String, Integer> entry = it2.next();
			entry.getKey();		// key
			entry.getValue();	// value
			System.out.println(entry);
		}
		System.out.println();
		
		
	} // end of main
} // end of class
