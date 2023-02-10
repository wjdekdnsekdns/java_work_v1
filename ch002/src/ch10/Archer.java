package ch10;

public class Archer extends Hero{
	public Archer(String name, int hp) {

		super(name, hp);// super 키워드는 부모 생성자를 호출 하는 녀석이다
	
		
	}
	void fireArror() {
		System.out.println(name + "가 불화살 공격을 합니다.");
	}
	public static void main(String[] args) {
		Archer archer = new Archer("애쉬", 100);
		archer.fireArror();
	}
}
