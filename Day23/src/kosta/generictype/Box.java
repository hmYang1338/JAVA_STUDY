package kosta.generictype;

// 제네릭 클래스
// ArrayList<>

// T : Type
// E : Element
// V : Value
// K : Key

public class Box <T> { // <> 여기는 아무거나 넣어도 됨
	
	private T object;
	
	public void set(T object) {
		this.object = object;
	}
	
	public T get()	{
		return this.object;
	}
	
}

// 원래 이거
/*public class Box {
	
	private Object object;
	
	public void set(Object object) {
		this.object = object;
	}
	
	public Object get()	{
		return this.object;
	}
	
}*/
