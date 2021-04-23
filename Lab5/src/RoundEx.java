
public class RoundEx {

	public static void main(String[] args) {
		Round [] c;
		c = new Round[5];
		
		for(int i = 0; i<c.length; i++) {
			c[i] = new Round(i);
		}
		
		for(int i=0; i<c.length; i++) {
			System.out.print((int)c[i].getArea()+" ");
		}

	}

}
