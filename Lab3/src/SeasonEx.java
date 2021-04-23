import java.util.Scanner;
public class SeasonEx {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("월 입력 : ");
		
		int month = a.nextInt();
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("spring");
			break;
			
		case 6: case 7: case 8:
			System.out.println("summer");
			break;
			
		case 9: case 10: case 11:
			System.out.println("autumn");
			break;
			
		case 12: case 1: case 2:
			System.out.println("winter");
			break;
			
		default: System.out.println("잘못된 월을 입력하셨습니다!");
		a.close();
			
		}

	}

}
