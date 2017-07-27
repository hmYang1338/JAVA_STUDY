package kosta.generictype;
/**
 * 인터페이스에서~~~~~~~~~~
 */
public interface Usable {
	
	// 상수	/ public static final을 생략해도 된다
	public static final int USED_L = 1;
	int USED_M = 2;
	
	
	// 추상메서드	/ public abstract를 생략해도 된다
	// - 반드시 재정의
	public abstract void used();
	
	
	// JAVA8 이후 -------
	// 디폴트 메서드 (옵션)	
	//	- 추상메서드는 구현하는 클래스에서 모두 사용되어야 하지만
	//  디폴트 메서드를 사용하면 필요한 클래스에서만 사용할 수 있다
	public default void defaultMethod() {
		System.out.println("Usable defaultMethod()");
	}
	
	// 스태틱 메서드	- 클래스의 스태틱 메서드와 동일
	public static void staticMethod() {
		System.out.println("라라라라라");
	}
	
}
