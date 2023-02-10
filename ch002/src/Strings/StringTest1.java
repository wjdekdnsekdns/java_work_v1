package Strings;

public class StringTest1 {

	public static void main(String[] args) {
		// 문자열이 이라는 데이터를 사용할 때
		String str1 = "반가워"; // 1번 방식 --> 상수 풀 영역에 올라 간다
		String str2 = new String("반가워"); // 2번 방식 --> 동적 메모리 영역에 올라 간다
		String str3 = new String("반가워"); // ?? 질문 str2 와 str3 은 주소값이 같나?
		String str4 = "반가워"; // ?? 질문 str1 와 str4 은 주소값이 같나?

		// 값 출력
		System.out.println("str1" + str1);
		System.out.println("str2" + str2);
		// 1번 방식과 2번 방식은 메모리 위치 시키는 곳이 다르다
		// == 값을 비교(기본 데이터 타입), 클래스 타입은 주소값을 비교 한다

		// 검증
		if (str1 == str2) {
			System.out.println("주소값 같음");
		} else {

			System.out.println("주소값 다름");

		}
		// 검증하기
		if (str2 == str3) {
			System.out.println("주소값 같음");
		} else {
			System.out.println("주소값 다름");
		}
		// 검증하기
		if (str1 == str4) {
			System.out.println("주소값 같음");
		} else {
			System.out.println("주소값 다름");
		}
		// 결론
		// 리터링 값으로 생성한 문자열은 상수 풀 이라는 역역에 올라가고
		// 동일한 문자열을 사용한다면 새로 생성ㅇ하지 않고 재활용하여 사용한다
		// 검증하기
		if (str1.equals(str2)) {
			System.out.println("문자열 모양 같음");
		} else {
			System.out.println("문자열 모양 다름");
		}
	}// end of main
}// end of class
