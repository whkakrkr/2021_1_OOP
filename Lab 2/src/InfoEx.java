import java.util.Scanner;

public class InfoEx {

	public static void main(String[] args) {
		System.out.println("이름 도시 나이 체중 미혼여부를 빈칸으로 분리햐여 입력하세요!");
		
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next(); //문자열 토큰 읽기
		System.out.println("이름: " + name);
		
		String city = scanner.next(); //문자열 토큰 읽기
		System.out.println("도시: " + city);
		
		int age = scanner.nextInt(); //정수 토큰 읽기
		System.out.println("나이: " + age);
		
		double weight = scanner.nextDouble(); //실수 토큰 읽기
		System.out.println("체중: " + weight);
		
		boolean single = scanner.nextBoolean(); //Boolean 토큰 읽기
		System.out.println("미혼여부: " + single);
		
		scanner.close();
	}

}
