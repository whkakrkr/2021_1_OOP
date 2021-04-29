
public class Rectangle {
	
	private double width, height, area;
	
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	
	public double getArea() {
		return width * height;
	}
	public void setArea(double area) {
		this.area = width * height;
	}

	public double ComputeArea() {
		area = width * height;
		return area;
	}
	
	public double ShowWidth() {
		return width;
	}
	
	public double ShowHeight() {
		return height;
	}
	
}