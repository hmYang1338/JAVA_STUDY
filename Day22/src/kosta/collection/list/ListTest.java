package kosta.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();		// 박스 만들기
		list.add("1");									// 담기
		list.add("string");
		list.add("string2");
		list.add("string2");
				
		System.out.println(list);
		
		String a = (String)list.get(3);
		System.out.println(a);

		
		/** list 꺼내오기 */								// 꺼내오기
		list.get(0);
		System.out.println(list.size());	// list의 개수확인
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for( String s : list )		// set은 이거 못씀 중복값 허용이 안되기 때문
			System.out.println(s);
		
		Iterator<String> it = list.iterator();
		it.hasNext();	// 다음것이 있는지 확인
		while(it.hasNext()){
			String s = it.next();	// 꺼내오기
			System.out.println(s);
			System.out.println(it.next());
		}
		
		
		
		
	} // end of main
} // end of class



