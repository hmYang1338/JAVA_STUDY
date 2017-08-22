package student.manage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import student.vo.Student;

/**
 * Student ���� ������ ó���ϴ� Ŭ����
 * ����� �Ұ���!
 */
// Ŭ���� ����
public class StudentManager {

	// �ʵ� - ��������
	private static List<Student> list = new LinkedList<>();
	
	static {
		Logger logger = Logger.getLogger("StudentProject--kosta.student");
		logger.info("3. StudentManager");
		list.add(new Student(1, "ȫ�浿", "����", "A", "��", 20, 180.0, 90, 1));
		list.add(new Student(2, "���缮", "���", "A", "��", 30, 170.0, 70, 2));
		list.add(new Student(3, "�鼳��", "����", "B", "��", 25, 160.0, 80, 1));
		list.add(new Student(4, "���ָ�", "�泲", "C", "��", 34, 156.0, 50, 3));
		list.add(new Student(5, "����", "����", "C", "��", 60, 190.0, 40, 1));
		list.add(new Student(6, "�־ֶ�", "���", "A", "��", 40, 165.0, 40, 4));
		list.add(new Student(7, "������", "����", "B", "��", 30, 185.0, 30, 1));
		list.add(new Student(8, "�ڳ���", "�泲", "A", "��", 10, 160.0, 60, 2));
		list.add(new Student(9, "������", "���", "B", "��", 44, 165.0, 90, 3));
	}
	
	// �л� ���� �߰�
	public static boolean add(Student s) {
		return list.add(s);
	}
	
	// ��� -------------------------------------------------------------------------
	// ����Ʈ ���(�̸�/����)
	public static List<Student> select7(Comparator<Student> comparator) {
		//Collections.sort(list);
		Collections.sort(list, comparator);
		return list;
	}
	
	// ����Ʈ ���(�̸�/����)
	public static List<Student> select8(Comparator<Student> comparator) {
		return list.stream().sorted(comparator).collect(Collectors.toList());
	}
	
	// �ݺ� ����Ʈ ��� 7
	public static Map<String, List<Student>> selectGroup7() {
		// <��, �ݺ� ����Ʈ>
		Map<String, List<Student>> map = new HashMap<>();
		
		Iterator<Student> it = list.iterator();
		
		while(it.hasNext()) {
			Student s = it.next();
			
			// �ʿ� ���� ������..
			if(map.containsKey(s.getBan())) {
				List<Student> list = map.get(s.getBan());
				System.out.println("�ִ�" + s.getNum());
				list.add(s);
			}
			
			// �ʿ� ���� ������..
			else {
				List<Student> list = new ArrayList<>();
				
				System.out.println("����" + s.getNum());
				list.add(s);
				map.put(s.getBan(), list);
			}
		}
		
		return map;
	}
	
	// �ݺ� ����Ʈ ��� 8
	public static Map<String, List<Student>> selectGroup8() {
		return list.stream().collect(Collectors.groupingBy(s -> s.getBan()));
	}
	
	// �˻� -------------------------------------------------------------------------
	/**
	 * �̸����� �˻� 
	 * @param name �˻��� �̸�
	 * @return �˻��� �л� ����
	 */
	public static Student searchName8(String name) {
		/*Optional<Student> op = list.stream().filter(s -> s.getName().equals(name)).findAny();
		Student s = op.get();
		return s;*/
		
		return list.stream().filter(s -> s.getName().equals(name)).findAny().get();
	}
	
	/**
	 * �ּҷ� �˻� 
	 * @param addr �˻��� �ּ�
	 * @return �˻��� �л� ����
	 */
	public static Student searchAddr8(String addr) {
		/*Optional<Student> op = list.stream().filter(s -> s.getAddr().equals(addr)).findAny();
		Student s = op.get();
		return s;*/
		
		return list.stream().filter(s -> s.getAddr().equals(addr)).findAny().get();
	}
	
	/**
	 * �˻� 
	 * @param predicate ���͸� ���� 
	 * @return �˻��� �л� ����
	 */
	public static Student search8(Predicate<Student> predicate) {
		/*Optional<Student> op = list.stream().filter(predicate).findAny();
		Student s = op.get();
		return s;*/
		
		return list.stream().filter(predicate).findAny().get();
	}
	
	/**
	 * �˻� 
	 * @param predicate ���͸� ���� 
	 * @return �˻��� �л� ����Ʈ
	 */
	public static List<Student> search88(Predicate<Student> predicate) {
		/*List<Student> list = list.stream().filter(predicate).collect(Collectors.toList());
		return list;*/
		
		return list.stream().filter(predicate).collect(Collectors.toList());
	}
	
	
	// ��� -------------------------------------------------------------------------
	/**
	 * �ݺ� ���
	 */
}




