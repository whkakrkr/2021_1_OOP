
public class ReplaceEx {

	public static void main(String[] args) {
		String s = "월요일부터 금요일까지는 평일, 토일은 즐거운 주말~~~~ 주말 최고~";
		s = s.replace("월요일", "Monday");
		s = s.replace("화요일", "Tuesday");
		s = s.replace("수요일", "Wednesday");
		s = s.replace("목요일", "Thursday");
		s = s.replace("금요일", "Friday");
		s = s.replace("토요일", "Saturday");
		s = s.replace("일요일", "Sunday");
		
		System.out.println(s);

	}

}
