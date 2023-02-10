package ch09;

import java.util.Scanner;

public class BookStoreManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Book[] books = new Book[100];
		String userIput = null;
		boolean flag = true;
		int lastindex = 0;
		
		int firstChkVal = 0; /* while문 처음인지 아닌지를 구분하기 위한 변수
								0 : 1회
								1 : 2회 이상
							 */
		while (flag == true) {
			System.out.println("메뉴를 선택");
			System.out.println("1. 저장\t2. 전체조회\t3. 선택조회\t4. 전체 삭제\t0. 프로그램종료");
			if(firstChkVal == 0) {
				userIput = sc.nextLine();
			} else {
				userIput = sc.nextLine();
			}

			if (userIput.equals("0")) {
				flag = false;
			} else if (userIput.equals("1")) {
				System.out.println("저장할 책 이름을 적으세요");
				String title = sc.next();
				if(title == "1" || title == "2" || title == "3" || title == "4" || title == "0") {
					System.out.println("책 이름은 한글을 반드시 포함해주세요.");
					title = sc.next();
				}
				System.out.println("저장할 저자 이름을 적으세요");
				String author = sc.next();
				books[lastindex] = new Book(title, author);
				lastindex++;
			} else if (userIput.equals("2")) {
				System.out.println("전체 조회를 선택 하셨습니다");
				if (books[0] == null) {
					System.out.println("보유중인 도서가 없습니다.");
				} else {
					for (int i = 0; i < books.length; i++) {
						if (books[i] != null) {
							books[i].showInfo();
						}
					}
				}
			} else if (userIput.equals("3")) {
				if (books[0] == null) {
					System.out.println("보유중인 도서가 없습니다.");
				} else {
					System.out.println("제목을 입력하세요");
					String booktitle = sc.nextLine();
					for(int i = 0; i < books.length; i++) {
						if(books[i] != null) {
							if (books[i].getTitle().equals(booktitle)) {
								books[i].showInfo();
							}
						}
					}
				}
			} else if (userIput.equals("4")) {
				
			} 
			firstChkVal = 1;
		}

		// 책을 저장하는 기능 만들고
		// 정보를 출력하는 프로그래밍 만들기
		// 스캐너
		// 문자열 비교
		// == : 값을 비교하는 연산자
		// while 문을 사용해서
		// CRUD 에 개념 검색
		// 1 누리면 저장 2 누르면 전체조회 3 누르면 선택조회 4 누르면 전체삭제 0 프로그램 종료

		// 문자비교 하는법
//		String temp = "안녕";
//		if(temp.equals("안녕")) {
//			System.out.println("같은 값 확인");
//		}else {
//			System.out.println("값이 달라요");
//		}
//		
//		System.out.println("------------------");
//		
//		if("반가워".equals(temp)) {
//			System.out.println("같은 값 확인");
//		}else {
//			System.out.println("값이 달라요");
//		}

	}
	
}

