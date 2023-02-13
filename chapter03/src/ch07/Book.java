package ch07;

/**
 * 
 * Object 클래스 자바는 단일 상속만을 지원한다 하지만 모든 클래스의 최상위 클래스 Object 클래스는 예외 이다
 */
public class Book {

	private int bookId;
	private String title;
	private String author;

	public Book(int bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}

	// 코드 힌트 살펴보기
	// extends Object 키워드를 작성하지 않더라도 컴파일러가 .class 생성시
	// 자동으로 넣어준다

	// toString() <-- Object 클래스에 메서드 이다
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ " + this.title + " ]";
	}

	// equals 메서드 재정의 하기
	// 책 제목과 작가 이름이 같다면 같은 책 이라고 판별 해보자
	@Override
	public boolean equals(Object obj) {
		// 만약 외주에서 주입된 값에 title 과 author 이 같다면 true 를 리턴
		// 아니라면 false 리턴하자
		// Book 이라는 데이터 타입만 확인하자 !! 방어적 코드
		if (obj instanceof Book) {
			Book targetBook = (Book) obj;
			if (this.title == targetBook.title && this.author == targetBook.author) {
				System.out.println("같은 책 제목 입니다");
				return true;
			}

		}
		return false;

	}

}
