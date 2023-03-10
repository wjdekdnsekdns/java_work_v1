package ch06;

import java.util.ArrayList;

public class MainTest1 {

	public static void main(String[] args) {
		EmloyeeDAO emloyeeDAO = new EmloyeeDAO();
		ArrayList<EmployeeDTO> tempList =  emloyeeDAO.showTitleEmpInfo("Staff");
		for (int i = 0; i < tempList.size(); i++) {
			String empNo = tempList.get(i).getEmpNo();
			String firstName = tempList.get(i).getFirstName();
			String title = tempList.get(i).getTitle();
			System.out.println("empNo : " + empNo);
			System.out.println("firstName : " + firstName);
			System.out.println("title : " + title);
		}
		
////		ArrayList<EmployeeDTO> tempList2 =  emloyeeDAO2.showTitleEmpInfo("Georgi");
////		for (int i = 0; i < tempList2.size(); i++) {
////			String firstName = tempList2.get(i).getFirstName();
////			String lastName = tempList2.get(i).getLastName();
////			String salary = tempList2.get(i).getSalary();
		
		
		
		
//			System.out.println("firstName : " + firstName);
//			System.out.println("lastName : " + lastName);
//			System.out.println("salary : " + salary);
//		}
//		
//		EmployeeDTO dto =  emloyeeDAO.showSalaryCount("Georgi", "Facello");
//		String count = dto.getSalarycount();
//		System.out.println("count : " + count);
	}

}
