package ch07;

public class Student {

	// 학번과 이름을 정의
	// 생성자

	private int studentId;
	private String name;

	public Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}

	// 1.
	// toString --> 학번 이름이 화면에 출력할 수 있도록 설계
	@Override
	public String toString() {
		
		return this.studentId + this.name;
	}
	// 2.
	// equals 메서드를 재 정의 해주세요
	// 이름이 같다면 동명이인입니다 라고 출력
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
		Student stu = (Student)obj;
		if(this.name == stu.name) {
			System.out.println("동명이인 입니다");
			return true;
		 }
		}
		return false;
	}
}
