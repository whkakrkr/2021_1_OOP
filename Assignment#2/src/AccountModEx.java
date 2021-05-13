
// 컴퓨터공학전공 2071010 김선영

import java.util.Scanner;
public class AccountModEx {

	public static void main(String[] args) {
		
		Account [] accountArray;
		Scanner s = new Scanner (System.in);
		
		//입력할 계좌 수 정하기
		System.out.print("입력할 계좌의 개수를 입력하세요 : ");
		int num = s.nextInt();
		accountArray = new Account [num];
		System.out.println(" ");
		
		// 계좌 정보 입력받기
		for(int i=0; i<accountArray.length; i++) {
			
			System.out.println((i+1) + "번째 계좌의 정보를 입력해주세요.");
			
			System.out.print("이름 : ");
			String owner = s.next();
			
			System.out.print("잔액 : ");
			int balance = s.nextInt();
			
			System.out.print("이율 : ");
			double rate = s.nextDouble();
			
			accountArray[i] = new Account(owner, balance, rate);	//배열에 저장

			//거래내역 입력받기
			System.out.print("입금액 : ");
			int deposit = s.nextInt();
			accountArray[i].deposit(deposit);
			
			System.out.print("출금액 : ");
			int withdraw = s.nextInt();
			accountArray[i].withdraw(withdraw);

			System.out.print("돈을 맡긴 개월 수 : ");
			int month = s.nextInt();
			accountArray[i].computeTotal(month);
			
			System.out.println(" ");
			System.out.println("---------------------------------------");
			System.out.println(" ");

			
		}
		
		//내역 보여주기
		for(int i=0; i<accountArray.length; i++) {
			
			System.out.println((i+1) + "번째 계좌의 정보와 거래내역을 출력합니다.");
			accountArray[i].showAll();
			
		}
		
		s.close();
		
	}

}
