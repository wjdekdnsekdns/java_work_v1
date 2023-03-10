package ch04;

import java.util.HashSet;
import java.util.Random;

public class ex3 {
public static void main(String[] args) {
	

	HashSet<Integer> numberSet = new HashSet<>();
	
	int count = 0;
	while(numberSet.size() != 6) {
		count++;
		numberSet.add(getRandomNumber());
	}
	System.out.println(numberSet.toString());
	System.out.println("반복 횟수 : " + count);
}

private static int getRandomNumber() {

	Random random = new Random();
	return random.nextInt(45)+1;
}
}