package kosta.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "a");	// �� �Է�
		map.put(3, "b");
		map.put(2, "b");
		
		System.out.println(map);
		
		String s = map.get(1);
		System.out.println(s);
		
		
		// �������� ��� 1 / Ű�� ���ո�
		Set<Integer> keySet = map.keySet();		
		for(Integer key : keySet) {
			String ss = map.get(key);
			System.out.println(ss);
		}
		
		// �������� ��� 2 / (Ű,��)�� ����
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
