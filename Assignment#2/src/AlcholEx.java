
// 컴퓨터공학전공 2071010 김선영
// 커스텀음료 주문하기 실행파일

import java.util.Scanner;

public class AlcholEx {

	public static void main(String[] args) {
		
		int total_price=0;
		
		Alchol [] alcholArray;
		Scanner s = new Scanner(System.in);
		
		//주문할 음료의 종류 정하기
		System.out.print("주문할 음료의 종류 수를 입력하세요 : ");
		int n = s.nextInt();
		alcholArray = new Alchol [n];
		System.out.println(" ");
		
		// 주문 정보 입력받기
		for(int i=0; i<alcholArray.length; i++) {
			
			System.out.println((i+1) + "번째로 주문하실 음료를 커스텀하세요.");
			System.out.println("음료의 종류를 선택하세요");
			System.out.println("1.일반음료 / 2. 무알콜음료 / 3. 행사용 공짜 음료");
			int select = s.nextInt();
			
			//1. 일반음료
			if(select == 1) {
				System.out.print("이름 : ");
				String name = s.next();
				
				System.out.print("도수 : ");
				double strength = s.nextDouble();
				
				System.out.print("가격 : ");
				int price = s.nextInt();
				
				System.out.print("잔 수 : ");
				int num = s.nextInt();
				
				alcholArray[i] = new Alchol(name, strength, price, num);	//배열에 저장
				}
			
			//2. 무알콜음료
			else if (select == 2) {
				System.out.print("이름 : ");
				String name = s.next();
				
				System.out.print("가격 : ");
				int price = s.nextInt();
				
				System.out.print("잔 수 : ");
				int num = s.nextInt();
				
				alcholArray[i] = new Alchol(name, price, num);	//배열에 저장
				}
			
			//3. 공짜음료
			else if (select == 3) {
				System.out.print("이름 : ");
				String name = s.next();
				
				System.out.print("도수 : ");
				double strength = s.nextDouble();
				
				System.out.print("잔 수 : ");
				int num = s.nextInt();
				
				alcholArray[i] = new Alchol(name, strength, num);	//배열에 저장
				}		
			}
		
		//주문서 출력
		System.out.println("------------------------");
		System.out.println("주문서");
		System.out.println("------------------------");
		
		for(int i=0; i<alcholArray.length; i++) {
			alcholArray[i].showReceipt();
			System.out.println("==>" + alcholArray[i].totalPrice() + "원");
		}
		
		for(int i=0; i<alcholArray.length; i++) {
			total_price = total_price + alcholArray[i].totalPrice();  
		}
		
		System.out.println("총합 = " + total_price + "원");
		
		s.close();
		}
		
		
}
