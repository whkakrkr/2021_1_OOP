import java.io.IOException; //입력예외처리를 위한 클래스
import java.util.Scanner; 

public class ComputeEx04 {

	public static void main(String[] args) throws IOException {
		int num1, num2, sum=0;
		char k; //연산자 입력받을 변수
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요: ");
		num1 = s.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요: ");
		num2 = s.nextInt();
		
		System.out.print("연산을 선택하세요: ");
		System.out.println("1:덧셈(+), 2:뺄셈(-),3.곱셈(*),4:나눗셈(/)");
		
		k=(char)System.in.read();
		
		if(k=='+') {
			sum = num1 + num2 ;
			System.out.println(num1+"+"+"="+sum);
		}

		if(k=='-') {
			sum = num1 - num2 ;
			System.out.println(num1+"-"+"="+sum);
		}

		if(k=='*') {
			sum = num1 * num2 ;
			System.out.println(num1+"*"+"="+sum);
		}

		if(k=='/') {
			if(num2 != 0) {
				sum = num1 / num2 ;
				System.out.println(num1+"/"+"="+sum);
			} else System.out.println("0으로 나누면 안됩니다."); }
			
		if(k=='%') {
			if(num2 != 0) {
				sum = num1 % num2 ;
				System.out.println(num1+"%"+"="+sum);
			} else System.out.println("0으로 나누면 안됩니다."); }
				
		s.close();


	}

}
