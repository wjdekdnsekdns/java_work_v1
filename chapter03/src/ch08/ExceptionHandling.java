package ch08;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		// try-catch-finally
		// finally 언제 사용하는지
		Scanner scanner = new Scanner(System.in);

		try {
			int result = scanner.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			scanner.close();// 자원 해제 용도로도 많이 사용 된다
		}

	}// end of main

}
