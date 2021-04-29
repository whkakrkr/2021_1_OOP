
public class EmployeeEx {

	public static void main(String[] args) {
		Employee e1, e2, e3;
		e1 = new Employee("미은",35000);
		e2 = new Employee("정황지", 50000);
		e3 = new Employee("위성연", 20000);
		
		int n = Employee.getcount();
		System.out.println("현재의 직원 수 : " + n);
	}

}
