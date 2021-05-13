
// 컴퓨터공학전공 2071010 김선영

public class Account {
	
	String owner;
	int balance;
	double rate;
	
	//(1)사용자 이름과 예금액, 연이율
	public Account(String owner, int balance, double rate) {
		this.owner = owner;
		this.balance = balance;
		this.rate = rate;
	}
	
	//(2) 사용자 이름과 연이율
	public Account(String owner, double rate) {
		this.owner = owner;
		this.rate = rate;
		this.balance = 0;
	}
	
	//(3) 사용자 이름과 예금액
	public Account(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
		this.rate = 0;
	}
	
	
	
	// 예금과 출금과 이자율처리
	public void deposit(int deposit) {
		this.balance = this.balance + deposit;
	}
	public void withdraw(int withdraw) {
		this.balance = this.balance - withdraw;
	}
	public void rate(double rate) {
		this.rate = rate;
	}
	public void computeTotal(int month) {
		this.balance = (int) (this.balance + month*this.balance*(this.rate/12));
	}
	
	
	
	//show 메소드들
	public void showBalance() {
		System.out.println("Balance = " + balance);
	}
	public void showOwner() {
		System.out.println("Owner = " + owner);
	}
	public void showRate() {
		System.out.println("Rate = " + rate);
	}
	public void showAll() {
		System.out.printf("\n");
		System.out.println("Owner = " + owner);
		System.out.println("Balance = " + balance);
		System.out.println("Rate = " + rate);
		System.out.printf("\n");
	}
	

}
