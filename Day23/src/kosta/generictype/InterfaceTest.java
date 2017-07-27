package kosta.generictype;

// Usable 클래스 참조
public class InterfaceTest {
	public static void main(String[] args) {

		// 스태틱 메서드
		Usable.staticMethod();

		// 상수
		System.out.println(Usable.USED_L);

		Usable uc = new UsableClass();
		// 추상 메서드 재정의
		uc.used();

		// 디폴트 메서드 - 동적바인딩
		uc.defaultMethod(); // 클래스꺼 호출

		// 익명 클래스
		Usable u = new Usable() {

			@Override
			public void used() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous Class Use()");
			}
		};	// 메서드까지 바로 호출 가능
		u.used();
		
		
		// 람다식
		Usable uu2 = () -> System.out.println("Anonymous Class use()");
		uu2.used();
		
		
		
	} // end of main
} // end of class
