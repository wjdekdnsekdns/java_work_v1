package ch06;

public class EmployeeDTO {
	private String empNo;
	private String firstName;
	private String lastName;
	private String title;
	
	private String gender;
	private String salary;
	private String salarycount;
	
	
	
	public String getSalarycount() {
		return salarycount;
	}
	public void setSalarycount(String salarycount) {
		this.salarycount = salarycount;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
}
