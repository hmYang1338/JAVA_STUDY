package kosta.generictype;

// Usable Ŭ���� ����
public class InterfaceTest {
	public static void main(String[] args) {

		// ����ƽ �޼���
		Usable.staticMethod();

		// ���
		System.out.println(Usable.USED_L);

		Usable uc = new UsableClass();
		// �߻� �޼��� ������
		uc.used();

		// ����Ʈ �޼��� - �������ε�
		uc.defaultMethod(); // Ŭ������ ȣ��

		// �͸� Ŭ����
		Usable u = new Usable() {

			@Override
			public void used() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous Class Use()");
			}
		};	// �޼������ �ٷ� ȣ�� ����
		u.used();
		
		
		// ���ٽ�
		Usable uu2 = () -> System.out.println("Anonymous Class use()");
		uu2.used();
		
		
		
	} // end of main
} // end of class
