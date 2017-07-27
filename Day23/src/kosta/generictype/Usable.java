package kosta.generictype;
/**
 * �������̽�����~~~~~~~~~~
 */
public interface Usable {
	
	// ���	/ public static final�� �����ص� �ȴ�
	public static final int USED_L = 1;
	int USED_M = 2;
	
	
	// �߻�޼���	/ public abstract�� �����ص� �ȴ�
	// - �ݵ�� ������
	public abstract void used();
	
	
	// JAVA8 ���� -------
	// ����Ʈ �޼��� (�ɼ�)	
	//	- �߻�޼���� �����ϴ� Ŭ�������� ��� ���Ǿ�� ������
	//  ����Ʈ �޼��带 ����ϸ� �ʿ��� Ŭ���������� ����� �� �ִ�
	public default void defaultMethod() {
		System.out.println("Usable defaultMethod()");
	}
	
	// ����ƽ �޼���	- Ŭ������ ����ƽ �޼���� ����
	public static void staticMethod() {
		System.out.println("������");
	}
	
}
