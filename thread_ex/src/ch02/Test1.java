package ch02;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	
	public int[] getLottoNumber(){
		Random random = new Random();
		int[] lotto = new int[6];
		for(int i = 0; i <lotto.length; i++) {
			int j = random.nextInt(45)+1;
			lotto[i] = j;
			for(int e = 0; e < i; e++) {
				if(lotto[i] == lotto[e]) {
					i -= -1;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		return lotto;
	}
	
}

