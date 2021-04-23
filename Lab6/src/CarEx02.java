import java.util.Scanner;
public class CarEx02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("자동차 데이터 입력! ");
		System.out.print("이름 : "); String name = s.next();
		System.out.print("너비 : "); int width = s.nextInt();
		System.out.print("높이 : "); int height = s.nextInt();
		System.out.print("길이 : "); int length = s.nextInt();
		System.out.print("연료량 : "); int fuel = s.nextInt();
		
		Car myCar = new Car(name, width, height, length, fuel);
		
		while(true) {
			System.out.println("현재 위치(" + myCar.getX() + "," + myCar.getY() + ") 남은연료" + myCar.getFuel());
			System.out.print("이름?[0:No, 1:Yes] : ");
			if(s.nextInt()==0) break;
			
			System.out.print("x방향의 이동거리 : ");
			double dx = s.nextDouble();
			System.out.print("y방향의 이동거리 : ");
			double dy = s.nextDouble();
			
			if(!myCar.move(dx,  dy)) System.out.println("연료부족!");
		}
		s.close();
		
	}

}
