package Starcraft2;

/**
 * 
 * @author 정다운
 *
 */

public class Zealot {

	private String name;
	private int power;
	private int hp;
	private int upgrade;

	// 생성자
	public Zealot(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 80;
		this.upgrade = 5;
	}

	// getter 메소드 만들기
	public String getName() {
		return this.name;
	}

	public int getPower() {
		return this.power;
	}

	public int getHp() {
		return this.hp;
	}

	// 질럿이 저글링을 공격 합니다
	public void attackZerging(Zerging zerging) {
		System.out.println(this.name + "이 " + zerging.getName() + "을 공격합니다");
		zerging.beAttack(this.power);

	}

	// 질럿이 마린을 공격 합니다
	public void attackMarin(Marine marine) {
		System.out.println(this.name + "이 " + marine.getName() + "을 공격합니다");
		// 질럿 공격력은 현재 5 이다
		marine.beAttack(this.power);
	}

	// 자기 자신이 공격을 당합니다
	public void beAttack(int power) {
		if(this.hp <=0) {
			System.out.println(this.name + "사망하였습니다");
			return; //값을 반환 할 때 사용할 수 있고 실행에 종료를 시킬 수도 있다
		}
		System.out.println(this.name + "공격을 당합니다");
		this.hp -= power;
	}
	public void upGradeat() {
		
		this.power += upgrade;
		System.out.println(this.name + " 의 공격력이 업그레이드 되었습니다");
	}

	public void showInfo() {
		System.out.println("====상태창====");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
		System.out.println();
	}
}
