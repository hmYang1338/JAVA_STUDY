package kosta.collection.set;
/**
 * hashCode(), equals() Overriding
 */
public class Car {
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

	
	// 필드값을 비교
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num;
		return result;
	}
	// 필드값을 비교
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num != other.num)
			return false;
		return true;
	}

	
}
