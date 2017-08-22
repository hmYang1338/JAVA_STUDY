package student.service;

import java.util.Scanner;

import student.manage.StudentManager;
import student.vo.Student;

public class StudentSearchService  implements StudentService {

	@Override
	public void execute(Scanner scan) {
		while (true) {
			System.out.println("----------------------------------");
			System.out.println("1. 주소 검색 ");
			System.out.println("2. 이름 검색 ");
			System.out.println("----------------------------------");
			switch (scan.nextInt()) {
			case 1:
				System.out.println("주소 : ");
				String addr = scan.nextLine();
				Student s1 = StudentManager.search8((s) -> s.getAddr().equals(addr));
				break;
			case 2:
				System.out.println("이름 : ");
				String name = scan.nextLine();
				Student s2 = StudentManager.search8((s) -> s.getName().equals(name));
				break;
			}
		}
	}

}
