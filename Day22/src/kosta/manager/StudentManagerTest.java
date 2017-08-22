package kosta.manager;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * 학생데이터를 입력받아 1. 추가, 2. 삭제, 3. 리스트 출력-번호로 
 * 4. 이름으로 검색, 5. 전체합 출력 
 * 6. 총점 최대/최소값 출력
 * 7. 반별 총점 출력 0. 종료(system.exit(0) 기능 생성
 *
 */
public class StudentManagerTest {
	public static void main(String[] args) {

		StudentManager sm = new StudentManager();
		String classRoom, name;
		int number;
		int num, kor, eng, mat;
		Scanner stdin = new Scanner(System.in);

		while (true) {
			System.out.println("-----------------------------");
			System.out.println("1.추가  2.삭제  3.리스트 출력");
			System.out.println("4.이름으로 검색 5.전체값 출력");
			System.out.println("6.최대/최소값 출력 ");
			System.out.println("7.반별 총점 출력 	   0.종료");
			System.out.println("-----------------------------");
			System.out.println();
			number = stdin.nextInt();

			switch (number) {
			case 1:
				System.out.print("번호 : ");
				num = stdin.nextInt();
				stdin.nextLine();
				System.out.print("이름 : ");
				name = stdin.nextLine();
				System.out.print("국어점수 : ");
				kor = stdin.nextInt();
				System.out.print("영어점수 : ");
				eng = stdin.nextInt();
				System.out.print("수학점수 : ");
				mat = stdin.nextInt();
				stdin.nextLine();
				System.out.println("반 : ");
				classRoom = stdin.nextLine();
				String c = sm.add(new Student(num, name, kor, eng, mat, classRoom));
				System.out.println(c);
				break;
			case 2:
				System.out.print("번호입력 : ");
				num = stdin.nextInt();
				stdin.nextLine();
				String a = sm.remove(num);
				System.out.println(a);
				break;
			case 3:
				sm.list();
				break;
			case 4:
				System.out.print("이름입력 : ");
				name = stdin.nextLine();
				sm.search(name);
				break;
			case 5:
				int b = sm.total();
				System.out.println("전체 합 : " + b);
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
