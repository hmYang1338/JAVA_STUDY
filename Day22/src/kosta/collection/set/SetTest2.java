package kosta.collection.set;
/**
 * 같은 값이 들어갔지만 해시코드 값이 다르기 때문에 서로 다른 것으로 인식한다
 *	new 할때마다 새로운 해시코드 값이 만들어진다
 *	해결 : Car클래스에서  hashCode(), equals() overriding을 시켜준다
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
		// 같은 값이 들어갔지만 해시코드 값이 다르기 때문에 서로 다른 것으로 인식한다
		// new 할때마다 새로운 해시코드 값이 만들어진다
		// 해결 : Car클래스에서  hashCode(), equals() overriding을 시켜준다
		
		
//		Car c = new Car(1, "bmw", "black");
//		Car c2 = new Car(1, "bmw", "black");
//		System.out.println(c.hashCode());
//		System.out.println(c2.hashCode());
//		System.out.println(c.equals(c2));
		
		// 방법 1
		for(Car c3 : set){
			System.out.println(c3.getNum()+" "+c3.getName()+" "+c3.getColor());
		}
		
		// 방법 2
		Iterator<Car> it = set.iterator();
		while(it.hasNext()){
			Car c = it.next();
			System.out.println(c.getNum()+" "+c.getName()+" "+c.getColor());
		}
		
		
		
		
		
	} // end of main
} // end of class
