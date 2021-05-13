
public class Phone {
	
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("전원on");
	}
	
	public void turnOff() {
		System.out.println("전원OFF");
	}
}
