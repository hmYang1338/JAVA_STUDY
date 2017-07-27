package kosta.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class StudentManager {
	// 학생정보 저장하는 리스트 - 하나만 생성 (static)
	static List<Student> list;
	Student a = new Student(1, "aaa", 80,80,80, "A");
	Student b = new Student(2, "bbb", 70,80,40, "A");
	Student c = new Student(3, "ccc", 80,70,80, "B");
	Student d = new Student(4, "ddd", 40,80,70, "B");
	Student e = new Student(1, "eee", 80,70,80, "C");
	Student f = new Student(3, "fff", 70,80,40, "C");
	Student g = new Student(2, "ggg", 100,40,80, "A");

	public StudentManager() {
		// TODO Auto-generated constructor stub
		if(list == null)
			list = new ArrayList<>();
	}
	
	// 학생정보추가 add
	public String add(Student s) {
		list.add(s);
		return "학생정보 추가성공";
	}

	// 학생정보 삭제 - 번호 remove
	public String remove(int num) {
		Iterator<Student> it = list.iterator();
		while(it.hasNext()){
			Student s = it.next();
			if(s.getNum() == num){
				it.remove();
			}
		}
		return "학생정보 삭제성공";
	}
	
	// 학생 정보 리스트 출력 - 총점 역순 list
	public void list() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t반");
		System.out.println("--------------------------------------------");
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o2.gettotal()-o1.gettotal();
			}
		});
		Iterator<Student> it = list.iterator();
		while(it.hasNext()){
			Student s = it.next();
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+
			s.getKor()+"\t"+s.getEng()+"\t"+s.getMat()+"\t"+s.getClassRoom());
		}
	}

	// 학생정보 이름으로 검색 - search
	public void search(String name) {
		Iterator<Student> it = list.iterator();
		while(it.hasNext()){
			Student s = it.next();
			if(s.getName().equals(name)){
				 System.out.println(s.toString());
			}
		}
	}
	
	// 전체합
	public int total() {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i).gettotal();
		}
		return sum;
	}
	
	// 최대/최소
	public Map<String, Integer> maxmin() {
		
		Map<String, Integer> map = new HashMap<>();
		int max = 0;
		int min = 300;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).gettotal() > max) {
				max = list.get(i).gettotal();
			}
			if(list.get(i).gettotal() < min) {
				min = list.get(i).gettotal();
			}
		}
		map.put("Max", max);
		map.put("Min", min);
		
		return map;
	}
	
	// 반별 총점 출력
	public Map<String, Integer> totalClass() {
		Map<String, Integer> map = new HashMap<>();
		Iterator<Student> it = list.iterator();
		while(it.hasNext()){
			Student s = it.next();
			// 맵에 키값이 있는지 여부 확인
			// (해당 반이 맵에 있는지 확인)
			if(map.containsKey(s.getClassRoom())){
				// 기존 합이 변경
				map.replace(s.getClassRoom(), map.get(s.getClassRoom())+s.gettotal());
			}else{
				// 새로 추가
				map.put(s.getClassRoom(), s.gettotal());
			}
			
		}
		return map;
		
		/*
		int totala=0;
		int totalb=0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getClass().equals("A")) {
				totala += list.get(i).gettotal();
			}else if (list.get(i).getClass().equals("B")) {
				totalb += list.get(i).gettotal();
			}
		}
		map.put("A", totala);
		map.put("B", totalb);
		return map;
	*/
		
		
	}
}
