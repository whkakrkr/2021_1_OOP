
public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ÀÇ areaCircle()!");
		return Math.PI*r*r;
	}
}
