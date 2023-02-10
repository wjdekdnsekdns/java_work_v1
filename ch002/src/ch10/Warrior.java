package ch10;

public class Warrior extends Hero {

	public Warrior(String name, int hp) {
		//부모 클래스에 사용자 정의 생성자가 있다면
		//부모 생성자를 반드시 호출 하여야 한다
		//System.out.println("1111111");//<-- 오류 부모 정의 생성자가 있으면 먼저 호출 해야함
		super(name, hp);// super 키워드는 부모 생성자를 호출 하는 녀석이다
		System.out.println("Warrior 생성자 마지막 줄 코드");
		
	}
	void comboAttack() {
		System.out.println(name + "가 2단 공격을 합니다.");
	}
	public static void main(String[] args) {
		Warrior warrior = new Warrior("야스오", 100);
		warrior.comboAttack();
		
		
		//메서드 오버로딩
		//System.out.println 이다
	}
}
