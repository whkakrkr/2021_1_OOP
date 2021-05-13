
public class ColorPoint extends Point {
	
	String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
//	void setColor(String color) {
//		this.color = color;
//	}
	
	void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
