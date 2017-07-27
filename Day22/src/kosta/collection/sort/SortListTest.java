package kosta.collection.sort;
/**
 * Collections: �÷��� ó���� ���� ��ƿ��Ƽ Ŭ����
 * �͸� Ŭ���� : �������̽��� ����Ϸ��� Ŭ������ ������ִ� ���ŷο� �۾��� �ؾ� �ϱ� ������
 * 				�̸� �ذ��ϱ����� �͸�Ŭ������ ����� ����� �� �ִ�
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
		
		
		/** Collections : �÷��� ó���� ���� ��ƿ��Ƽ Ŭ���� */
		Collections.sort(list);
		System.out.println(list);
		
//		DescSortComparator desc = new DescSortComparator();
		/*Collections.sort(list, new DescSortComparator());
		System.out.println(list);*/
		
		
		/** �͸�Ŭ���� */
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
