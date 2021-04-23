
public class ExMeesage01 {

	public static void main(String[] args) {
		int a=1000, b=0;
		int result;
		try {
			if(b==0)
				throw new Exception("0으로 나눌 수 없습니다!");
			result = a/b;
			}catch (Exception e) {
				System.out.print("오류메세지: ");
				System.out.println(e.getMessage());
			} }}

