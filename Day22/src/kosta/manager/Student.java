package kosta.manager;
/**
 * 학생 정보 저장하는 클래스
 * 필드 : 번호, 이름, 국어점수, 영어점수, 수학점수, 반
 * 메소드: getter/setter + 총점을 반환하는 메소드
 *
 */
public class Student {
	private int num;
	private String name = "";
	private int kor;
	private int eng;
	private int mat;
	private String classRoom = "";

	
	public Student(int num, String name, int kor, int eng, int mat, String classRoom) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.classRoom = classRoom;
	}
	
	public String getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}
	public int getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMat() {
		return mat;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public int gettotal() {
		int sum = kor + eng + mat;
		return sum;
	}

	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat
				+ ", classRoom=" + classRoom + "]";
	}
	
	
	
}
