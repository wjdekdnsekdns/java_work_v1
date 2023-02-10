package ch09;

import java.util.Scanner;

public class BookStoreManager2 {

   public static void main(String[] args) {

      // 준비물
      Scanner sc = new Scanner(System.in);
      // 배열의 길이를 지정해주어야한다
      Book[] books = new Book[100];
      boolean flag = true;

      final String SAVE = "1";
      final String SEARCH_ALL = "2";
      final String SEARCH_TITLE = "3";
      final String DELETE_ALL = "4";
      final String ESC = "0";
      // todo
      // 추후 삭제예정
      books[0] = new Book("플러터UI실전", "김근호");
      books[1] = new Book("무궁화 꽃이 피었습니다", "김진명");
      books[2] = new Book("흐르는 강물처럼", "파울로코엘료");
      books[3] = new Book("리딩으로리드하라", "이지성");
      books[4] = new Book("사피엔스", "유발하라리");

      int lastindexNumber = 0;
      
      // 실행의 흐름 만들어보기
      while (flag) {
         System.out.println("**메뉴 선택**");
         System.out.println("1.저장\t2.전체조회\t\t3.선택조회\t\t4.전체삭제\t0.종료");
         String selectedNumber = sc.nextLine();
         if (selectedNumber.equals(SAVE)) {
            // 저장
            System.out.println("저장하기");
            System.out.println("저장하기");
                System.out.println("책제목을 입력하세요");
                String bookTitle = sc.nextLine();
                System.out.println("저자이름을 입력하세요");
                String bookAuthor = sc.nextLine();
                Book book = new Book(bookTitle, bookAuthor);
                books[lastindexNumber] = book;
                lastindexNumber++;
                System.out.println(bookTitle + "책을 저장했어요~");
         } else if (selectedNumber.equals(SEARCH_ALL)) {
            // 전체조회
            System.out.println("전체 조회 하기");
            readAll(books);
         } else if (selectedNumber.equals(SEARCH_TITLE)) {
            // 선택조회
            reallByTitile(sc,books);
         } else if (selectedNumber.equals(DELETE_ALL)) {
            // 전체 삭제
            deleteAll(books);
         } else if (selectedNumber.equals(ESC)) {
            // 종료
            System.out.println("종료하기");
            flag = false;
         } else {
            System.out.println("잘못된 입력값입니다.\n다시선택바람");
         }
      }


   }
   //전체조회하기 코드
   public static void readAll(Book[] books) {
   System.out.println("전체 조회 하기");
   for (int i = 0; i < books.length; i++) {
      if (books[i] != null) {
         System.out.println(books[i].getTitle());
      }
   }
   System.out.println();
   }
//선택 조회하기
   public static void reallByTitile(Scanner sc,Book[] books) {
      System.out.println("선택 조회 하기");
      String bookTitle = sc.nextLine();
      for (int i = 0; i < books.length; i++) {
         if (books[i] != null) {
            if (books[i].getTitle().equals(bookTitle)) {
               System.out.println(books[i].getTitle() + " : " + books[i].getAuthor());
            }
         }
      }
   }
   //전체삭제
   public static void deleteAll(Book[] books) {
      System.out.println("전체 삭제 하기");
      for (int i = 0; i < books.length; i++) {
         if (books[i] != null) {
            books[i] = null;
         }
      }
   }
   
   public static void save(Scanner scanner, Book[] books, int lastindexNumber) {
	   System.out.println("저장하기");
       System.out.println("책제목을 입력하세요");
       String bookTitle = scanner.nextLine();
       System.out.println("저자이름을 입력하세요");
       String bookAuthor = scanner.nextLine();
       Book book = new Book(bookTitle, bookAuthor);
       books[lastindexNumber] = book;
       lastindexNumber++;
       System.out.println(bookTitle + "책을 저장했어요~");
 
}
   
   
   
}   

