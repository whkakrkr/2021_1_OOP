import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		int num;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Á¤¼ö ÀÔ·Â: ");
		num = s.nextInt();
		
		if(num%2 == 0) {
			System.out.println("Â¦¼ö");
		} else {
			System.out.println("È¦¼ö");
		}
		
		s.close();
	}

}
