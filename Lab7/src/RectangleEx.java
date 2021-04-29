
public class RectangleEx {

	public static void main(String[] args) {
		
		Rectangle R1 = new Rectangle(10, 20);
		Rectangle R2 = new Rectangle(20, 30);
		
		R1.setWidth(5.0);
		R1.setHeight(30.0);
		//R1.area = R1.width * R1.height;
		
		double area1 = R1.ComputeArea();
		double width1 = R1.ShowWidth();
		double height1 = R1.ShowHeight();
		
		System.out.println("R1 area : " + area1 + "R1 width : " + width1 + "R1 height1 : " + height1);
		
		R2.setWidth(5.0);
		R2.setHeight(20.0);
		// R2.area = R2.width * R2.height;
		
		double area2= R2.ComputeArea();
		double width2 = R2.ShowWidth();
		double height2 = R2.ShowHeight();

		System.out.println("R2 area : " + area2 + "R2 width : " + width2 + "R2 height1 : " + height2);
		
	}

}
