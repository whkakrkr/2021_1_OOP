import java.util.Scanner;
public class DibideByZero {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int dividend, divisor;
		System.out.println("나뉨수 입력: ");
		dividend = s.nextInt();
		System.out.println("나눔수를 입력: ");
		divisor = s.nextInt();
		
		System.out.println(dividend + "를" + divisor + "로 나누면 몫은" + dividend/divisor + "입니다.");
		s.close();
	}

}
