package kosta.generictype;
/**
 * 학생 정보 저장하는 클래스
 * 필드 : 번호, 이름, 국어점수, 영어점수, 수학점수
 * 메소드: getter/setter + 총점을 반환하는 메소드
 *
 */
public class Student {
	private int num;
	private String name = "";
	private int kor;
	private int eng;
	private int mat;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int num, String name, int kor, int eng, int mat) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
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
		return "Student [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}
	
	
}
