package ch004;

public class GenericBookPrinter <T extends MakingBook>{

	private T makingBook;

	public T getMakingBook() {
		return makingBook;
	}

	public void setMakingBook(T makingBook) {
		this.makingBook = makingBook;
	}
	@Override
	public String toString() {
		
		return makingBook.toString();
	}
	
	
}
