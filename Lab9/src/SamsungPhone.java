
public class SamsungPhone extends PhoneInterface implements PhoneInterface {
	
	@Override
	public void sendCall() {
		System.out.println("따르릉");
	}
	
	@Override
	public void receiveCall() {
		System.out.println("전화왔습니다");
	}
	
	@Override
	public void flash() {
		System.out.println("불켜졌어요");
	}
	public void schedule() {
		System.out.println("일정관리");
	}
}
