package kosta.collection.set;
/**
 * Set은 get으로 불러올 수 없기 때문에 일반적인 for문을 사용할 수 없다
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
		
		// 방법 1
		for( String s : set ) {		// 확장 for문
			System.out.println(s);
		}
		
		// 방법 2
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
		
	} // end of main
} // end of class
