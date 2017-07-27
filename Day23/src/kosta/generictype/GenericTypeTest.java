package kosta.generictype;

public class GenericTypeTest {
	public static void main(String[] args) {
		
		/*Box box = new Box();
		
		box.set("String");
//		box.set(5);
		
		Object o = box.get();
		
		System.out.println(o instanceof Integer);
		
		if(o instanceof String){
			// 타입을 확인한다
		}
		*/
		
		Box<Integer> box1 = new Box<>();  // <> 여기서 타입을 지정한다
		box1.set(7);
		Object o = box1.get();
		
		System.out.println(o instanceof Integer);
		
		Pair<String, Integer> p = new Pair<>();
		p.put("a", 4);
		System.out.println(p.get("a"));
		
	} // end of main
} // end of class
