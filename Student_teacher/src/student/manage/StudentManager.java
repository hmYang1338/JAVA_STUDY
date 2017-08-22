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
 * Student 관련 데이터 처리하는 클래스
 * 입출력 불가능!
 */
// 클래스 정의
public class StudentManager {

	// 필드 - 정보은닉
	private static List<Student> list = new LinkedList<>();
	
	static {
		Logger logger = Logger.getLogger("StudentProject--kosta.student");
		logger.info("3. StudentManager");
		list.add(new Student(1, "홍길동", "서울", "A", "남", 20, 180.0, 90, 1));
		list.add(new Student(2, "유재석", "경기", "A", "남", 30, 170.0, 70, 2));
		list.add(new Student(3, "백설희", "서울", "B", "여", 25, 160.0, 80, 1));
		list.add(new Student(4, "김주만", "충남", "C", "남", 34, 156.0, 50, 3));
		list.add(new Student(5, "고동만", "서울", "C", "남", 60, 190.0, 40, 1));
		list.add(new Student(6, "최애라", "경기", "A", "여", 40, 165.0, 40, 4));
		list.add(new Student(7, "정준하", "서울", "B", "남", 30, 185.0, 30, 1));
		list.add(new Student(8, "박나래", "충남", "A", "여", 10, 160.0, 60, 2));
		list.add(new Student(9, "송혜교", "경기", "B", "여", 44, 165.0, 90, 3));
	}
	
	// 학생 정보 추가
	public static boolean add(Student s) {
		return list.add(s);
	}
	
	// 출력 -------------------------------------------------------------------------
	// 리스트 출력(이름/성적)
	public static List<Student> select7(Comparator<Student> comparator) {
		//Collections.sort(list);
		Collections.sort(list, comparator);
		return list;
	}
	
	// 리스트 출력(이름/성적)
	public static List<Student> select8(Comparator<Student> comparator) {
		return list.stream().sorted(comparator).collect(Collectors.toList());
	}
	
	// 반별 리스트 출력 7
	public static Map<String, List<Student>> selectGroup7() {
		// <반, 반별 리스트>
		Map<String, List<Student>> map = new HashMap<>();
		
		Iterator<Student> it = list.iterator();
		
		while(it.hasNext()) {
			Student s = it.next();
			
			// 맵에 반이 있으면..
			if(map.containsKey(s.getBan())) {
				List<Student> list = map.get(s.getBan());
				System.out.println("있다" + s.getNum());
				list.add(s);
			}
			
			// 맵에 반이 없으면..
			else {
				List<Student> list = new ArrayList<>();
				
				System.out.println("없다" + s.getNum());
				list.add(s);
				map.put(s.getBan(), list);
			}
		}
		
		return map;
	}
	
	// 반별 리스트 출력 8
	public static Map<String, List<Student>> selectGroup8() {
		return list.stream().collect(Collectors.groupingBy(s -> s.getBan()));
	}
	
	// 검색 -------------------------------------------------------------------------
	/**
	 * 이름으로 검색 
	 * @param name 검색할 이름
	 * @return 검색된 학생 정보
	 */
	public static Student searchName8(String name) {
		/*Optional<Student> op = list.stream().filter(s -> s.getName().equals(name)).findAny();
		Student s = op.get();
		return s;*/
		
		return list.stream().filter(s -> s.getName().equals(name)).findAny().get();
	}
	
	/**
	 * 주소로 검색 
	 * @param addr 검색할 주소
	 * @return 검색된 학생 정보
	 */
	public static Student searchAddr8(String addr) {
		/*Optional<Student> op = list.stream().filter(s -> s.getAddr().equals(addr)).findAny();
		Student s = op.get();
		return s;*/
		
		return list.stream().filter(s -> s.getAddr().equals(addr)).findAny().get();
	}
	
	/**
	 * 검색 
	 * @param predicate 필터링 조건 
	 * @return 검색된 학생 정보
	 */
	public static Student search8(Predicate<Student> predicate) {
		/*Optional<Student> op = list.stream().filter(predicate).findAny();
		Student s = op.get();
		return s;*/
		
		return list.stream().filter(predicate).findAny().get();
	}
	
	/**
	 * 검색 
	 * @param predicate 필터링 조건 
	 * @return 검색된 학생 리스트
	 */
	public static List<Student> search88(Predicate<Student> predicate) {
		/*List<Student> list = list.stream().filter(predicate).collect(Collectors.toList());
		return list;*/
		
		return list.stream().filter(predicate).collect(Collectors.toList());
	}
	
	
	// 통계 -------------------------------------------------------------------------
	/**
	 * 반별 평균
	 */
}




