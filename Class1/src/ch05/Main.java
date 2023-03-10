package ch05;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// 학생 생성
		Student student1 = new Student(1, "Alice", "alice@example.com");
		Student student2 = new Student(2, "Bob", "bob@example.com");

		// 과정 생성
		Course course1 = new Course(1, "Math", "introduction to Mathematics");
		Course course2 = new Course(2, "English", "introduction to English");

		// 1번학생이 Math 과정을 등록
		Enrollment enrollment1 = new Enrollment(1, student1, course1);
		Enrollment enrollment2 = new Enrollment(2, student2, course2);
		Enrollment enrollment3 = new Enrollment(3, student1, course2);

		// 학생에 데이터에 내가 등록한 정보를 저장 시킬 수 있다.
		// ArrayList<Enrollment> list = new ArrayList<>();
		// list.add(enrollment1);
		// student1.setEnrollments(list); // 통으로 List 저장 하는 녀셕
		// 학생에 기능을 이용
		student1.addEnrollment(enrollment1); // 0번째 인덱스
		student1.addEnrollment(enrollment3); // 1번째 자료구조 저장

		student2.addEnrollment(enrollment2); // Bob 등록신청 정보 저장

		// 문제 1
		// Bob 가 신청한 과정에 이름을 화면에 출력 하시오
		// 문제 해결 방안 - 요청 사항 : 학생으로 접근
		// ArrayList<Enrollment> a;
		// a.course
		System.out.println(student2.getEnrollments().get(0).getCourse().getName());
		// student2.getEnrollments().get(0).getCourse().getName(); // enrollment2

		System.out.println("------------------------------");

		// 문제 2
		// Alice 가 신청한 과정에 이름을 화면에 출력 하시오
		for (int i = 0; i < student1.getEnrollments().size(); i++) {
			String studentName = student1.getName();
			Course course = student1.getEnrollments().get(i).getCourse();
			String courseName = course.getName();
			System.out.println(studentName + ", courseName : " + courseName);
		}
		// 위 코드는 학생과 과목을 Enrollment 클래스를 통해서 연결하는 예제 코드 이다.
		
		// 문제 3
		// Enrollment 1 학생 정보와 과목 정보를 반복문 통해서 출력해주세요
		// 학생 이름 : 이름
		// 수강 과목 : 과목 이름
		// -----------------------
		System.out.println("학생 이름 : " + enrollment1.getStudent().getName());
		System.out.println("수강 과목 : " + enrollment1.getCourse().getName());
		
		// 문제 4
		// ArrayList 를 생성해서 Enrollment 저장해주세요
		ArrayList<Enrollment> items = new ArrayList<>();
		items.add(enrollment1);
		items.add(enrollment2);
		items.add(enrollment3);
		
		for(Enrollment e : items) {
			System.out.println(e.getStudent().getName());
			System.out.println(e.getCourse().getName());
			System.out.println("------------------------");
		}
		
		// foreach Alice 에 수강하고 있는 과목 이름을 다시 한번 더 출력 하시오.
		for (Enrollment enrollment : student1.getEnrollments()) {
			System.out.println(enrollment.getCourse().getName());
		}
		
		// A, B, C, D - value
		
	}// end of main

}// end of class
