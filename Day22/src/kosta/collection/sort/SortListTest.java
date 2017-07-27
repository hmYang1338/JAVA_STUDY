package kosta.collection.sort;
/**
 * Collections: 컬렉션 처리를 위한 유틸리티 클래스
 * 익명 클래스 : 인터페이스를 사용하려면 클래스를 만들어주는 번거로운 작업을 해야 하기 때문에
 * 				이를 해결하기위해 익명클래스를 만들어 사용할 수 있다
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListTest {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Graph");
		list.add("Banana");
		list.add("Orange");
		list.add("Melon");

		System.out.println(list);
		
		
		/** Collections : 컬렉션 처리를 위한 유틸리티 클래스 */
		Collections.sort(list);
		System.out.println(list);
		
//		DescSortComparator desc = new DescSortComparator();
		/*Collections.sort(list, new DescSortComparator());
		System.out.println(list);*/
		
		
		/** 익명클래스 */
		/*Comparator<String> com = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
//				return o1.compareTo(o2);
				return o2.compareTo(o1);
			}};
		Collections.sort(list, com);*/
			
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
//				return o1.compareTo(o2);
				return o2.compareTo(o1);
			}});
			
		
		
		
		
	} // end of main
} // end of class
