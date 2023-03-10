package ch05;

public class Enrollment {
	
	private int enrollmentId;
	private Student student;
	private Course course;
	
	public int getEnrollmentId() {
		return enrollmentId;
	}

	public Student getStudent() {
		return student;
	}

	public Course getCourse() {
		return course;
	}

	
	public Enrollment(int enrollmentId, Student student, Course course) {
		super();
		this.enrollmentId = enrollmentId;
		this.student = student;
		this.course = course;
	}
	
}
