package ch004;

public class MainTest {

	public static void main(String[] args) {
		GenericBookPrinter<Paper> bookPrinter1 = new GenericBookPrinter<>();
		GenericBookPrinter<Ink> bookPrinter2 = new GenericBookPrinter<>();

		
		bookPrinter1.setMakingBook(new Paper());
		bookPrinter2.setMakingBook(new Ink());
	
		System.out.println(bookPrinter1);
		System.out.println(bookPrinter2);
	}

}
