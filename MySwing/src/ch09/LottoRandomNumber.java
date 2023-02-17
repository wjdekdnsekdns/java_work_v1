package ch09;

import java.util.Arrays;
import java.util.Random;

// 기능 구현
// 랜덤 번호 발생하는 클래스 1~45
// get,set 필요하면 만들기
//6개 번호를 리턴하는 기능 만들기<오름차순 정렬>
public class LottoRandomNumber {
int[] lotto = new int[6];
	public int[]getLottoNumber(){
		int[] lotto = new int[6];
		Random random = new Random();
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
