package Ex01;

import java.util.Arrays;
import java.util.Random;

// 기능 구현
// 랜덤 번호 발생하는 클래스 1~45
// get,set 필요하면 만들기
//6개 번호를 리턴하는 기능 만들기<오름차순 정렬>
public class LottoRandomNumber {
	final int LOTTO_NUMBER_SIZE = 6;

	public int[] createNumber() {
		int[] lottoWinNum = new int[LOTTO_NUMBER_SIZE];
		Random random = new Random();
		for (int i = 0; i < lottoWinNum.length; i++) {
			lottoWinNum[i] = random.nextInt(45) + 1;
			// 중복 검증
			// i = 0 -->inner for x --> i = 0
			//
			// 두번째 for문 수행시 10, 20
			// j == 0, i == 1 --> 1번 for 실행
			// lottoWinNum[0] = -> 10
			// lottoWinNum[1] = -> 20
			for (int j = 0; j < i; j++) {
				// 처음 for문 돌때 i ==1, j == 0
				if(lottoWinNum[i] == lottoWinNum[0]) {
					i--;
				}
			}
		}
		Arrays.sort(lottoWinNum); // 오름차순 정렬
		return lottoWinNum;
	}
	
}
