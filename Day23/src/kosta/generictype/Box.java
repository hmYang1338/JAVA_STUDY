package kosta.generictype;

// ���׸� Ŭ����
// ArrayList<>

// T : Type
// E : Element
// V : Value
// K : Key

public class Box <T> { // <> ����� �ƹ��ų� �־ ��
	
	private T object;
	
	public void set(T object) {
		this.object = object;
	}
	
	public T get()	{
		return this.object;
	}
	
}

// ���� �̰�
/*public class Box {
	
	private Object object;
	
	public void set(Object object) {
		this.object = object;
	}
	
	public Object get()	{
		return this.object;
	}
	
}*/
