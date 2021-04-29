
public class Circle {

	int radius;
	String name;
	
	public static final double PI = 3.14;
	
	public Circle() {
		this(2,"");
	}
	
	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	
	public double getArea() {
		return PI * this.radius * this.radius;
	}
	
}
