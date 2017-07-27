package kosta.generictype;
// GenericMethodTest 참조
public class GenericMethod {
	// 제네릭 메서드
	// 접근제한자 <제네릭타입> 반환형 메서드명(매개변수)
	
	// 매개변수가 제네릭타입인 경우
	public <T> void set(T t){
		
		System.out.println(t.getClass());	// 클래스의 종류를 알려줌
	}
	
	// 반환형이 제네릭타입인 경우
	public <T> T get(T[] ts, int index){

		return ts[index];
	}
	
	// 매개변수, 반환형 제네릭 타입인 경우
	// T,R은 Object에 상속을 받은 것들
	public <T, R> R getClassName(T t){
		return (R) t.getClass().getSimpleName();
	}
	
	
}
