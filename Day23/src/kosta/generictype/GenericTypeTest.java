package kosta.generictype;

public class GenericTypeTest {
	public static void main(String[] args) {
		
		/*Box box = new Box();
		
		box.set("String");
//		box.set(5);
		
		Object o = box.get();
		
		System.out.println(o instanceof Integer);
		
		if(o instanceof String){
			// Ÿ���� Ȯ���Ѵ�
		}
		*/
		
		Box<Integer> box1 = new Box<>();  // <> ���⼭ Ÿ���� �����Ѵ�
		box1.set(7);
		Object o = box1.get();
		
		System.out.println(o instanceof Integer);
		
		Pair<String, Integer> p = new Pair<>();
		p.put("a", 4);
		System.out.println(p.get("a"));
		
	} // end of main
} // end of class
