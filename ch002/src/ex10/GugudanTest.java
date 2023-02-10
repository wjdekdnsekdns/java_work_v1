package ex10;

import java.util.Scanner;

public class GugudanTest {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단을 출력학 범위 값 숫자 2개를 입력하시오");
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		
		for (; n1 <= n2; n1++) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(n1 + " * " + i + " = " + n1 * i);
			}
		}
	}
}
