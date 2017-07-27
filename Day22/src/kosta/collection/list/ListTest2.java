package kosta.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest2 {
	public static void main(String[] args) {

		List<Car> list = new ArrayList<>(); // List°¡ ºÎ¸ð

		list.add(new Car(1, "bmw", "black"));
		list.add(new Car(2, "audi", "black"));
		list.add(new Car(3, "hyundai", "yellow"));
		list.add(new Car(4, "kia", "white"));
		list.add(new Car(5, "VW", "red"));
		
		System.out.println(list.toString());
		
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
			Car c = list.get(i);
			System.out.println(c.getColor());
			System.out.println(list.get(i).getColor());
		}
		System.out.println();
		
		for(Car c : list){
			System.out.print(c.getNum());
			System.out.print(c.getName());
			System.out.print(c.getColor());
		}
		System.out.println();	
		
		Iterator<Car> it = list.iterator();
		while(it.hasNext()){
			Car c = it.next();
			System.out.println(c.getNum()+" "+c.getName()+" "+c.getColor());
		}
		
		
		
	} // end of main
} // end of class
