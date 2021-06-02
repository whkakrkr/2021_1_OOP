import java.util.*;
public class Demo {

	public static void main(String[] args) {
		String s = "{a+b)*(c+d)+e}/{f-(g-h))*(i+j)}";
		StirngTokenizer st = new StringTokenizer(s, " { } ( ) ", true);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
