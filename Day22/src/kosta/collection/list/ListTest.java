package kosta.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();		// �ڽ� �����
		list.add("1");									// ���
		list.add("string");
		list.add("string2");
		list.add("string2");
				
		System.out.println(list);
		
		String a = (String)list.get(3);
		System.out.println(a);

		
		/** list �������� */								// ��������
		list.get(0);
		System.out.println(list.size());	// list�� ����Ȯ��
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for( String s : list )		// set�� �̰� ���� �ߺ��� ����� �ȵǱ� ����
			System.out.println(s);
		
		Iterator<String> it = list.iterator();
		it.hasNext();	// �������� �ִ��� Ȯ��
		while(it.hasNext()){
			String s = it.next();	// ��������
			System.out.println(s);
			System.out.println(it.next());
		}
		
		
		
		
	} // end of main
} // end of class



