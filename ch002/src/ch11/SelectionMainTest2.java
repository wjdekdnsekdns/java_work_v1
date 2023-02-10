package ch11;

import java.util.Random;
import java.util.Scanner;

public class SelectionMainTest2 {

	public static void main(String[] args) {
		Selection selection1 = new Bear();
		Selection selection2 = new Gun();
		Selection selection3 = new Car();
		Random random = new Random();
		int ranNum = random.nextInt(5) + 1;
		int ranNum2 = random.nextInt(3) + 1;
		Scanner sc = new Scanner(System.in);
		boolean i = true;
		// 2개
		// 0 , 1
		// 스캐너 받고

		Selection[] selections = new Selection[4];
		selections[1] = selection1;
		selections[2] = selection2;
		selections[3] = selection3;
	
		while (i) {
			System.out.println("숫자 1~5까지 하나를 입력 하세요");
			int scNum = sc.nextInt();
			if (ranNum == scNum) {
				if (ranNum2 == 1) {
					System.out.println(selection1.name + " 당첨");
					i = false;
				} else if (ranNum2 == 2) {
					System.out.println(selection2.name + " 당첨");
					i = false;
				} else if (ranNum2 == 3) {
					System.out.println(selection3.name + " 당첨");
					i = false;
				}
			} else {
				 System.out.println("다시 입력해주세요");
			}
		}
//		for (int i = 0; i < selections.length; i++) {
//			if (ranNum == i) {
//				System.out.println(selections[i].name + " 당첨");
//			} else {
//				System.out.println("꽝");
//			}
//		}

	}

}
