package ch06;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean die;

	// geter 메서드 직접 만들어 보세요.
	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	public int getPower() {
		return this.power;
	}

	public double getDefensc() {
		return this.defense;
	}

	public boolean getDie() {
		return this.die;
	}

	// setter 메서드 직접 만들어 보세요
	public void setString(String name) {
		this.name = name;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setDefense(double defense) {
		this.defense = defense;
	}

	public void setDie(boolean die) {
		// this.die = die;
		if (hp > 0) {
			System.out.println("잘못된 값을 입력 했습니다");
			return;
		}
	}
	// 방어적 코드도 추가해 보세요

}
