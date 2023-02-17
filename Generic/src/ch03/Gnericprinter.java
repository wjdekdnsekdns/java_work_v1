package ch03;

// 문법 - fow
// 이유 - why

public class Gnericprinter<T> {
	
	// T 라는 대체 문자를 사용한다. E - element, k - key, V - value (아무 문자열 다 가능)
	
	// 제네릭 자료형 이라고 부른다.
	private T material; // T 자료형으로 선언한 변수 - material
	
	// 제네릭 메서드 - T 자료형을 반환하는 제네릭 메서드
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
}
