package kosta.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "a");	// 값 입력
		map.put(3, "b");
		map.put(2, "b");
		
		System.out.println(map);
		
		String s = map.get(1);
		System.out.println(s);
		
		
		// 꺼내오는 방법 1 / 키의 집합만
		Set<Integer> keySet = map.keySet();		
		for(Integer key : keySet) {
			String ss = map.get(key);
			System.out.println(ss);
		}
		
		// 꺼내오는 방법 2 / (키,값)의 집합
		Set<Entry<Integer, String>> entrySet = map.entrySet();		
		for(Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey()+"="+entry.getValue());
//			System.out.println(entry.getValue());
		}
		
		Iterator<Entry<Integer, String>> it = map.entrySet().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		
		
		
		
	} // end of main
} // end of class
