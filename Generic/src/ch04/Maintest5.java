package ch04;

public class Maintest5 {

	// 윤년 계산기
	// 4의 배수의 해는 윤년
	// 4의 배수이면서 100의 배수인 해는 윤년이 아님
	// 100의 배수이면서 400의 배수는 해의 윤년
	public static void main(String[] args) {
		for (int i = 1000; i < 3000; i++) {
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
			System.out.println(i + "년은 윤년");
			
				}
			}
		}
	

}
//4로 400으로 
// 