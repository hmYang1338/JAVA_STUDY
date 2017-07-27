package kosta.manager;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * �л������͸� �Է¹޾� 1. �߰�, 2. ����, 3. ����Ʈ ���-��ȣ�� 
 * 4. �̸����� �˻�, 5. ��ü�� ��� 
 * 6. ���� �ִ�/�ּҰ� ���
 * 7. �ݺ� ���� ��� 0. ����(system.exit(0) ��� ����
 *
 */
public class StudentManagerTest {
	public static void main(String[] args) {

		StudentManager sm = new StudentManager();
		String classRoom;
		int number;
		int num, kor, eng, mat;
		String name;
		Scanner stdin = new Scanner(System.in);

		while (true) {
			System.out.println("-----------------------------");
			System.out.println("1.�߰�  2.����  3.����Ʈ ���");
			System.out.println("4.�̸����� �˻� 5.��ü�� ���");
			System.out.println("6.�ִ�/�ּҰ� ��� ");
			System.out.println("7.�ݺ� ���� ��� 	   0.����");
			System.out.println("-----------------------------");
			System.out.println();
			number = stdin.nextInt();

			switch (number) {
			case 1:
				System.out.print("��ȣ : ");
				num = stdin.nextInt();
				stdin.nextLine();
				System.out.print("�̸� : ");
				name = stdin.nextLine();
				System.out.print("�������� : ");
				kor = stdin.nextInt();
				System.out.print("�������� : ");
				eng = stdin.nextInt();
				System.out.print("�������� : ");
				mat = stdin.nextInt();
				stdin.nextLine();
				System.out.println("�� : ");
				classRoom = stdin.nextLine();
				String c = sm.add(new Student(num, name, kor, eng, mat, classRoom));
				System.out.println(c);
				break;
			case 2:
				System.out.print("��ȣ�Է� : ");
				num = stdin.nextInt();
				stdin.nextLine();
				String a = sm.remove(num);
				System.out.println(a);
				break;
			case 3:
				sm.list();
				break;
			case 4:
				System.out.print("�̸��Է� : ");
				name = stdin.nextLine();
				sm.search(name);
				break;
			case 5:
				int b = sm.total();
				System.out.println("��ü �� : " + b);
				break;
			case 6:
				Map<String, Integer> m = sm.maxmin();
				int max = m.get("Max");
				int min = m.get("Min");
				System.out.println("Max : "+ max);
				System.out.println("Min : "+ min);
				break;
			case 7:
				Map<String, Integer> m2 = sm.totalClass();
				Iterator<Entry<String, Integer>> it = m2.entrySet().iterator();
				while(it.hasNext()){
					Entry<String, Integer> entry = it.next();
					String room = entry.getKey();
					int total = entry.getValue();
					System.out.println(room +":"+total);
				}
				break;
			case 0:
				System.exit(0);
				break;
			default:
				break;
			}
		}
	} // end of main
} // end of class
