package kosta.generictype;
// GenericMethod 참조
public class GenericMethodTest {
	public static void main(String[] args) {
		GenericMethod g = new GenericMethod();
		
		g.set("String");
		g.set(3);
		g.set(new Student());
		
		
		String ss[] = new String[]{"1", "2", "3"};
		String s = g.<String> get(ss, 0);
		System.out.println(s);
		
		// 반환형이 Object형이니까 Integer
		Integer is[] = new Integer[]{1,2,3,4};
		Integer i = g.<Integer> get(is, 3);
		System.out.println(i);
		
		
		String ssss = g.getClassName("3");
		System.out.println(ssss);
		
		String iii = g.getClassName(1);
		System.out.println(iii);
	}
}
