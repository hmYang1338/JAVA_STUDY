package kosta.collection.sort;
/**
 * toString() Overriding
 */
public class Car implements Comparable<Car>{
	private int num;
	private String name;
	private String color;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(int num, String name, String color) {
		super();
		this.num = num;
		this.name = name;
		this.color = color;
	}


	public int getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [num=" + num + ", name=" + name + ", color=" + color + "]";
	}

	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		// 이름 비교
		return this.name.compareTo(o.name);
		// 번호 비교
//		return this.num - o.num;
	}
	
	
}
