package ch07;

public class MainTest3 {

	public static void main(String[] args) {
		Student student1 = new Student(1, "아무개");
		Student student2 = new Student(2, "아무개");
		Student student3 = new Student(3, "김아무개");
		// 자식 객체에 존재하는 각각에 rquals 메서드 호출이다

		// 주소값 비교하는것
		Boolean result1 = student1 == student2;
		System.out.println("result1 : " + result1);

		if (student1.equals(student2)) {
			System.out.println("이름이 같음");
		} else
			System.out.println("이름이 다름");

	}

}
