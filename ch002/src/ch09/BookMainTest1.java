package ch09;

public class BookMainTest1 {

	public static void main(String[] args) {
		// 연관된 하나의 데이터를 통으로 관리하고 싶다면 - 배열(자료구조)
		Book[] books = new Book[10]; // 배열 선언 (메모리 공간 만들어 두기)
		books[0] = new Book("플러UI실전", "김근호");
		books[1] = new Book("무궁화꽃이피었습니다", "김근형");
		books[2] = new Book("흐르는강물처럼", "파울로코엘료");
		books[3] = new Book("리딩으로리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발하라리");

		System.out.println(books[0].getTitle());
		System.out.println(books[4].getAuthor());
		// books.length --> 배열의 길이(10)
		for (int i = 0; i < books.length; i++) {
			// i --> 0, 1, 2, 3, 4, 5
			// 방어적 코드 짜기
			if (books[i] != null) {
				System.out.println(books[i].getTitle());
			} else {
				break;
			}
		}
		// 주의 1
		// 인덱스 스기는 n -1 개다
		// 배열에 길이와 인덱스에 길이는 다르다
		// 주의 2
		// 배열의 길이와 실제 들어가 있는 값에 갯수는 다를 수 있다

		// 문제
		// double 배열 4 선언 임의 값 넣고 출력
		// 3번째 인덱스는 값을 할당 하지 마시오
		// 출력은 for 문 -> 방어적 코드

		double[] arr = new double[4];
		arr[0] = 1.0;
		arr[1] = 2.0;
		arr[2] = 3.0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0.0) {

				System.out.println(arr[i]);

			}
		}
		// 예제 books 를 사용하세요
		// 문제 2
		// 0번째 인덱스에 있는 녀석과 인덱스 2번째 녀석에 값을 스왑해주세요
		Book temp = books[0];
		books[0] = books[2];
		books[2] = temp;
		System.out.println(books[0].getAuthor());
		System.out.println(books[2].getAuthor());
		
		//문제 3
		//인덱스 3번에 값을 삭제 해주세요
		books[3] = null;
		for (int i = 0; i < books.length; i++) {
			// i 값 활용
			if(books[i] != null) {
			books[i].showInfo();
			}
		}
	}

}
