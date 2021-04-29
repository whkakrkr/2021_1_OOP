
public class Point {
	private double x,y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this(0,0);
	}
	
	public Point(double n) {
		this(n,n);
	}
	
	public void SetX(double x) {
		this.x = x;
	}
	
	public void SetY(double Y) {
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void showPoint() {
		System.out.println(x + "," + y + " ");
	}
}
