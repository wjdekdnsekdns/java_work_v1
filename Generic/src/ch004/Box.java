package ch004;

public class Box<T> {

	private T contens;
	public Box() {
		this.contens = null;
	}
	// 넣다
	public void put(T item) {
		this.contens = item;
	}
	// 꺼내다
	public T take() {
		T item = this.contens;
		this.contens = null;
		return item;
	}
	public boolean isEmpty() {
		return this.contens == null;
	}
}
