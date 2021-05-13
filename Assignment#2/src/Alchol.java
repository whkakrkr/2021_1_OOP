
// 컴퓨터공학전공 2071010 김선영
// 커스텀음료 주문하기 클래스파일

public class Alchol {
	
	String name;
	double strength;
	int price;
	int num;
	
	//가격과 도수가 정해진 음료
	public Alchol (String name, double strength, int price, int num) {
		this.name = name;
		this.strength = strength;
		this.price = price;
		this.num = num;
	}
	
	//도수가 있는 술이지만 공짜여서 가격을 입력할 필요가 없는경우
	public Alchol (String name, double strength, int num) {
		this.name = name;
		this.strength = strength;
		this.price = 0;
		this.num = num;
	}
	
	//도수가 없는 무알콜 음료라서 도수를 입력할 필요가 없는경우
	public Alchol (String name, int price, int num) {
		this.name = name;
		this.strength = 0;
		this.price = price;
		this.num = num;
	}
	
	//주문한 술의 가격
	public int totalPrice() {
		return this.price * this.num;
	}
	
	//주문서출력
	public void showReceipt() {
		System.out.print(this.strength + "도 " + this.name + this.num + "잔 ");
	}
	
}
