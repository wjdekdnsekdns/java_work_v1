package ch11;

import java.util.Random;

public class SelectionMainTest {

	public static void main(String[] args) {
		Selection selection1 = new Bear();
		Selection selection2 = new Gun();
		Selection selection3 = new Car();
		Random random = new Random();
		int ranNum = random.nextInt(10) + 1;
		
		// 2개
		// 0 , 1
		// 스캐너 받고 
		
		Selection[] selections = new Selection[3];
		selections[0] = selection1;
		selections[1] = selection2;
		selections[2] = selection3;
		for (int i = 0; i < selections.length; i++) {
			if (ranNum == i) {
				System.out.println(selections[i].name + " 당첨");
			} else {
				System.out.println("꽝");
			}
		}

	}

}
