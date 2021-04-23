
public class ExMessage {

	public static void main(String[] args) {
		int a=10, b=0;
		int result;
		try {
			result = a/b;
		}catch (ArithmeticException e) {
			System.out.print("오류메세지: ");
			System.out.println(e.getMessage());
		}

	}

}
