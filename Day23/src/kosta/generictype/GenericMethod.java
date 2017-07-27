package kosta.generictype;
// GenericMethodTest ����
public class GenericMethod {
	// ���׸� �޼���
	// ���������� <���׸�Ÿ��> ��ȯ�� �޼����(�Ű�����)
	
	// �Ű������� ���׸�Ÿ���� ���
	public <T> void set(T t){
		
		System.out.println(t.getClass());	// Ŭ������ ������ �˷���
	}
	
	// ��ȯ���� ���׸�Ÿ���� ���
	public <T> T get(T[] ts, int index){

		return ts[index];
	}
	
	// �Ű�����, ��ȯ�� ���׸� Ÿ���� ���
	// T,R�� Object�� ����� ���� �͵�
	public <T, R> R getClassName(T t){
		return (R) t.getClass().getSimpleName();
	}
	
	
}
