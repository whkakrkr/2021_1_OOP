
// 객채지향프로그래밍 #hw1-2
// 컴퓨터공학전공 2071010 김선영

// 업데이트 항목
// 1. 기존 가위바위보 프로그램에서 연속으로 게임을 진행할 수 있게 업데이트 되었습니다.
// 2. 이제 게임이 끝날때마다 게임종료와 재도전을 선택할 수있는 메뉴가 나옵니다.
// 3. 게임 진행과정에서 전적이 표시되어 이용자의 경쟁심을 고취시킵니다. 
// 4. 결과창에서 승리,패배,무승부별로 귀여운 캐릭터가 함께 등장합니다.


import java.util.InputMismatchException;
import java.util.Scanner;
public class RockScissorPaper {
	
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int user, menu=1, game=0, win=0, lose=0, same=0;
		
		System.out.println("가위바위보 게임을 시작하겠습니다!");
		
		//게임실행
		while(true) {
			System.out.print("가위(0), 바위(1), 보(2) 를 선택하세요: ");
			
			try {
				user = s.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("0,1,2만 입력가능합니다!");
				s.next();
				continue;
			}
			
			int computer = (int)(Math.random()*3);
			
			System.out.println(" ");
			
			if(user == 0) System.out.print("나 : 가위");
			else if(user == 1) System.out.print("나 : 바위");
			else if(user == 2) System.out.print("나 : 보");
			else {
				System.out.println("0,1,2만 입력가능합니다!");
				continue;
			}
			
			if(computer == 0) System.out.print("vs가위 : 상대");
			else if(computer == 1) System.out.print("vs바위 : 상대");
			else if(computer == 2) System.out.print("vs보 : 상대");
			
			System.out.println(" ");
			
			//비겼을때
			if(user == computer) {
				System.out.println("비겼습니다. (ㅇㅅㅇ)");
				game++;
				same++;
				System.out.println(" ");
				System.out.println("현재 " + game + "전 " + win + "승 " + same + "무 " + lose + "패 입니다.");
				System.out.println(" ");
				System.out.println("1.재대결! / 2.여기서 종료");
				System.out.print("선택> ");
				menu = s.nextInt();
				if(menu==1) {
					System.out.println(" ");
					System.out.println("----------------------------");
					System.out.println(game+1 + "번째 게임을 시작합니다.");
					continue;
				}
				else{
					break;
				}
				
			}
			
			//이겼을때
			else if (user == (computer+1)%3) {
				System.out.println("이겼습니다! ㄴ(^ㅇ^)ㄱ");
				game++;
				win++;
				System.out.println(" ");
				System.out.println("현재 " + game + "전 " + win + "승 " + same + "무 " + lose + "패 입니다.");
				System.out.println(" ");
				
				System.out.println("1.연승도전! / 2.여기서 종료");
				System.out.print("선택> ");
				menu = s.nextInt();
				if(menu==1) {
					System.out.println(" ");
					System.out.println("----------------------------");
					System.out.println(game+1 + "번째 게임을 시작합니다.");
					continue;
				}
				else{
				    break;
				}
				
			}
			
			//졌을때
			else {
				System.out.println("졌습니다...(ㅠㅇㅠ)");
				game++;
				lose++;
				System.out.println(" ");
				System.out.println("현재 " + game + "전 " + win + "승 " + same + "무 " + lose + "패 입니다.");
				System.out.println(" ");
				System.out.println("1.한번더도전! / 2.패배를 인정하고 종료");
				System.out.print("선택> ");
				menu = s.nextInt();
				if(menu == 1) {
					System.out.println(" ");
					System.out.println("----------------------------");
					System.out.println(game+1 + "번째 게임을 시작합니다.");
					continue;
				}
				else{
					break;
				}
			}	
		} 
		System.out.println(" ");
		System.out.println("----------------------------");
		System.out.println("게임을 종료합니다.");
		System.out.println("당신의 기록 : " + game + "전 " + win + "승 " + same + "무 " + lose + "패");
		System.out.println(" ");
		System.out.println("제작 : 컴퓨터공학전공 2071010 김선영");
		s.close();	
		
	}

}