package Starcraft3;

public class Gateway {

	private String name;

	public Gateway() {
		this.name = "게이트웨이";
	}
	// 배역 -> 자료 구조
	// 질럿 생산하기
	public Zealot[] createZealot(int count) {
		//배열 선언
		Zealot[] arr = new Zealot[count];
		System.out.println("질럿을 생산 합니다");
		// index 값
		// 모든 프로그래밍에서 인덱스 시작은 0 부터 시작한다
		for (int i = 0; i < count; i++) {
			// i = 0
			// i = 1
			// i = 2
		 arr[i] =	new Zealot("질럿 1");
		}
		return arr;
	}
	// 드라군 생산하기

}
