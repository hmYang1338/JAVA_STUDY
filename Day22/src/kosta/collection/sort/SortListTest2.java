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
		
		/** Comparable�� �̿��� ���� */ 
		// Car class ����
		System.out.println(list);
		
		// ��ȣ ���� / �̸�����
		Collections.sort((List<Car>) list);
		System.out.println(list);
		
		
		System.out.println();
		
		//** Comparator�� �̿��� ���� *//*
		Collections.sort(list, new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				// TODO Auto-generated method stub
				
				// ��ȣ ����
//				return o2.getNum() - o1.getNum();
				
				// �̸� ����	// String�̴ϱ�
				return o1.getName().compareTo(o2.getName());
				
			}
		});
		System.out.println(list);
		
	} // end of main
} // end of class
