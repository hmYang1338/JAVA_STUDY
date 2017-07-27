package kosta.collection.set;
/**
 * Set�� get���� �ҷ��� �� ���� ������ �Ϲ����� for���� ����� �� ����
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("String1");
		set.add("String2");
		set.add("String3");
		
		System.out.println(set);
		
		// ��� 1
		for( String s : set ) {		// Ȯ�� for��
			System.out.println(s);
		}
		
		// ��� 2
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
		
	} // end of main
} // end of class
