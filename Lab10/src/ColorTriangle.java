
public class ColorTriangle extends DObject {

	String color;
	
	public ColorTriangle(int w, int g, String c) {
		super(w, h);
		color = c;
	}
	
	public void computeArea() {
		area = (width * height) / 2.0;
	}
	
	@Override
	public void show() {
		System.out.print("ColorTriangle : ");
		System.out.println(width + " " + height + " " + area + " " + color);
	}

}
