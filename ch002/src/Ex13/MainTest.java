package Ex13;

import java.util.Arrays;
import java.util.Random;

public class MainTest {

	public static void main(String[] args) {
		// 우리반 학생 이름들을 배열에 담아라
		// 랜덤 클래스 사용해서
		// 한명을 추출해 주세요
		Random random = new Random();
		int ranNum = random.nextInt(19);
		String[] arr = new String[20];
		arr[0] = "전대영";
		arr[1] = "편용림";
		arr[2] = "김효린";
		arr[3] = "김미정";
		arr[4] = "강민정";
		arr[5] = "한범진";
		arr[6] = "김경은";
		arr[7] = "손주이";
		arr[8] = "박성희";
		arr[9] = "아서영";
		arr[10] = "진석";
		arr[11] = "오세훈";
		arr[12] = "이현서";
		arr[13] = "김유주";
		arr[14] = "김지현";
		arr[15] = "김민우";
		arr[16] = "이치승";
		arr[17] = "김현우";
		arr[18] = "정다운";
		arr[19] = "이치운";

//		for(int i = 0; i < arr.length; i++) {
//			if(ranNum == i) {
//				System.out.println(arr[i]);
//			}
//		}
		int name = (int) (Math.floor(Math.random() * 20)) + 1;
		System.out.println(arr[name]);

		// 2
		int[] myNumbers = new int[10];
		myNumbers[0] = 10;
		myNumbers[1] = 4;
		myNumbers[2] = 100;
		myNumbers[3] = 23;
		myNumbers[4] = 51;
		myNumbers[4] = 1;
		myNumbers[6] = 6;
		myNumbers[7] = 88;
		myNumbers[8] = 42;
		myNumbers[9] = 31;
		Arrays.sort(myNumbers);
		// 오름 차순으로 정렬 해주세요
		// for , if 문 활용
		for (int i = 0; i < myNumbers.length; i++) {
			if(myNumbers.length == 10) {
				System.out.println(myNumbers[i]);
			}
		}

		
		
	}

}
