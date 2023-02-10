package ch08;

public class EmployeeMainTest {

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.setName("이순신");
		System.out.println(employee1.serialNum);

		Employee employee2 = new Employee();
		employee2.setName("홍길동");
		System.out.println();

		Employee employee3 = new Employee();
		employee3.setName("티모");
		// static 변수만 사용을 한면
		// 각 각에 객체가 가지는 상대값을 저장해야 한다면
		// 멤버 변수를 활용해서 사용해야 한다
		System.out.println(Employee.serialNum);

		// 홍길동읠 사원번호
		System.out.println(employee2.getEmployeeId());
		// 티모의 사원번호
		System.out.println(employee3.getEmployeeId());

	}

}
