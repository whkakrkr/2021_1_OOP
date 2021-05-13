
public class SupersonicEX {

	public static void main(String[] args) {
		Supersonic sa = new Supersonic();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = Supersonic.SUPERSONIC;
		sa.fly();
		sa.flyMode = Supersonic.NORMAL;
		sa.fly();
		sa.land();
	}

}
