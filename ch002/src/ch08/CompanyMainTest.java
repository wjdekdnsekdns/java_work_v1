package ch08;

public class CompanyMainTest {

	public static void main(String[] args) {

		//Company company = new Company(); 사용 불가
		Company company = Company.getInstance();
		System.out.println(company);
		//ch08.Company@12c8a2c0
		Company company2 = Company.getInstance();
		Company company3 = Company.getInstance();
		System.out.println(company2);
		System.out.println(company3);
	}// end of main

}// end of class
