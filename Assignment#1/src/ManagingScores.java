
// 객채지향프로그래밍 #hw1-1
// 컴퓨터공학전공 2071010 김선영

import java.util.Scanner;
import java.util.InputMismatchException;

public class ManagingScores {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int menu=0, student, max=0;
		float sum=0, avg;
		int score[];
		char alphabet;
		
		//메뉴1번 들어갈때까지 메뉴창띄워주기
		while(true) {
			System.out.println("----------------------------------------------------");  //메뉴보여주기
			System.out.println("MENU : 1.학생수입력, 2.점수입력, 3.점수리스트, 4.점수분석, 5.종료");  //메뉴보여주기
			System.out.println("----------------------------------------------------"); //메뉴보여주기
			
			System.out.print("선택> ");
			menu = s.nextInt(); //메뉴입력받기
			
			if (menu==5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(menu == 1) {
				System.out.print("학생 수를 입력하세요 : ");
				student = s.nextInt(); //student는 학생 수	
				score = new int[student]; //학생수+1과 크기가 같은 배열을 생성. +1인 이유는 배열크기 초과방지.
				
				//메뉴2번 들어갈때가지 메뉴창띄워주기
				while(true) {
					System.out.println("----------------------------------------------------");  //메뉴보여주기
					System.out.println("MENU : 1.학생수입력, 2.점수입력, 3.점수리스트, 4.점수분석, 5.종료");  //메뉴보여주기
					System.out.println("----------------------------------------------------"); //메뉴보여주기
					
					System.out.print("선택> ");
					menu = s.nextInt(); //메뉴입력받기
					
					if (menu == 5) {
						System.out.println("프로그램을 종료합니다.");
						break;
					}
					else if(menu == 2) {
						System.out.println("정수를 입력하세요.");
						
						for(int i=0; i<student; i++) {
							System.out.print(i+1 + "번 학생의 점수 :");
							try {
								score[i] = s.nextInt(); //i+1번째 학생의 score
								
								if((score[i]>100) || (score[i]<0)) {
									System.out.println("범위(0점이상 100점미만)에 해당하는 정수를 입력해주세요.");
									i--;	// 인덱스 증가방지.
									continue;
								}
							}
							catch(InputMismatchException e) {
								System.out.println("정수가 아닙니다. 다시 입력해주세요");
								s.next();
								i--;	// 인덱스 증가방지.
								continue; //이어서 입력하게 하기
							}
						}
						
						//메뉴창띄워주기
						while(true) {
							System.out.println("----------------------------------------------------");  //메뉴보여주기
							System.out.println("MENU : 1.학생수입력, 2.점수입력, 3.점수리스트, 4.점수분석, 5.종료");  //메뉴보여주기
							System.out.println("----------------------------------------------------"); //메뉴보여주기
							
							System.out.print("선택> ");
							menu = s.nextInt(); //메뉴입력받기
							
							if (menu==5) {
								System.out.println("프로그램을 종료합니다.");
								break;
							}
							// 3번메뉴진행
							else if(menu == 3) {
								for(int j=0; j<student; j++) {
									System.out.print(j+1 + "번 학생 : " + score[j] +"점 "); //ㅁ번 학생 : ㅁ점
									for(int m=0; m<score[j]; m++) {
										System.out.print("*"); //막대그래프
									}
									System.out.print("\n");
								}
							}
							
							// 4번메뉴진행
							else if(menu == 4) {
								for(int i=0; i<student; i++) {
									//알파벳 부여하기
									if(score[i] >= 90) {
										alphabet = 'A';
									}
									else if((score[i] >= 80) && (score[i] < 90)) {
										alphabet = 'B';
									}
									else if((score[i] >= 70) && (score[i] < 80)) {
										alphabet = 'C';
									}
									else if((score[i] >= 60) && (score[i] < 70)) {
										alphabet = 'D';
									}
									else {
										alphabet = 'F';
									}
									System.out.println(i+1 + "번 학생 : " + score[i] + "점   " + alphabet + "학점"); // ㅁ번 학생 : ㅁ점   ㅁ학점
								}
								
								//최고값 구하기
								for(int i = 0; i<student; i++) {
									if(max < score[i]) {
										max = score[i];
									}
								}
								
								//평균값 구하기
								for(int i = 0; i<student; i++) {
									sum += score[i];
								}
								avg = sum/student;
								
								System.out.println(" ");
								System.out.println("최고 점수 : " + max + "점");
								System.out.printf("평균 점수 : %.2f 점\n", avg);
							}
							
							else {
								System.out.println("3이나 4중에서 선택하세요. 종료를 원하시면 5를 선택하세요");
							}
						}
						break;
						
					}
					else {
						System.out.println("메뉴 2번을 먼저 실행해주세요");
						continue;
					}
				}
				break;
			}
			else {
				System.out.println("메뉴 1번을 먼저 실행해주세요.");
				continue; //메뉴로 돌아가기
			}
			
		}
		s.close();
		
	}
}