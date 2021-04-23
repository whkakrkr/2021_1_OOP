
public class CircleEx {

	public static void main(String[] args) {
		
		Circle pizza = new Circle(10, "java pizza");
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의면적: " + area);
		
		Circle donut = new Circle();
		donut.name = "도넛피자";
		area = donut.getArea();
		
		System.out.println(donut.name + "의면적: " + area);

	}

}
