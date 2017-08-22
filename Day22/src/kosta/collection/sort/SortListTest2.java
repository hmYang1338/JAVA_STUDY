package kosta.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortListTest2 {
	public static void main(String[] args) {
		
		List<Car> list = new ArrayList<>();
		
		list.add(new Car(1, "bmw", "black"));
		list.add(new Car(2, "audi", "red"));
		list.add(new Car(3, "bmw", "black"));
		list.add(new Car(4, "bmw", "black"));
		list.add(new Car(5, "kia", "white"));
		
		/** Comparable을 이용한 정렬 */ 
		// Car class 참조
		System.out.println(list);
		
		// 번호 정렬 / 이름정렬
		Collections.sort((List<Car>) list);
		System.out.println(list);
		
		
		System.out.println();
		
		//** Comparator를 이용한 정렬 *//*
		Collections.sort(list, new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				// TODO Auto-generated method stub
				
				// 번호 정렬
//				return o2.getNum() - o1.getNum();
				
				// 이름 정렬	// String이니까
				return o1.getName().compareTo(o2.getName());
				
			}
		});
		System.out.println(list);
		
	} // end of main
} // end of class
