package kosta.collection.set;
/**
 * ���� ���� ������ �ؽ��ڵ� ���� �ٸ��� ������ ���� �ٸ� ������ �ν��Ѵ�
 *	new �Ҷ����� ���ο� �ؽ��ڵ� ���� ���������
 *	�ذ� : CarŬ��������  hashCode(), equals() overriding�� �����ش�
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest2 {
	public static void main(String[] args) {
		
		Set<Car> set = new HashSet<>();
		
		set.add(new Car(1, "bmw", "black"));
		set.add(new Car(2, "audi", "red"));
		set.add(new Car(1, "bmw", "black"));
		set.add(new Car(1, "bmw", "black"));
		set.add(new Car(3, "kia", "white"));
		// ���� ���� ������ �ؽ��ڵ� ���� �ٸ��� ������ ���� �ٸ� ������ �ν��Ѵ�
		// new �Ҷ����� ���ο� �ؽ��ڵ� ���� ���������
		// �ذ� : CarŬ��������  hashCode(), equals() overriding�� �����ش�
		
		
//		Car c = new Car(1, "bmw", "black");
//		Car c2 = new Car(1, "bmw", "black");
//		System.out.println(c.hashCode());
//		System.out.println(c2.hashCode());
//		System.out.println(c.equals(c2));
		
		// ��� 1
		for(Car c3 : set){
			System.out.println(c3.getNum()+" "+c3.getName()+" "+c3.getColor());
		}
		
		// ��� 2
		Iterator<Car> it = set.iterator();
		while(it.hasNext()){
			Car c = it.next();
			System.out.println(c.getNum()+" "+c.getName()+" "+c.getColor());
		}
		
		
		
		
		
	} // end of main
} // end of class
