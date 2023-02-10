package ch05;

public class Subway1 {

	int lineNumber;
	int passengerCount;
	int money;

	// 생성자 - 리턴 타입 없고, 클래스 이름과 같다
	public Subway1(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) {
		this.money = money;
		this.passengerCount++;

	}

	public void showInfo() {
		System.out.println("승객번호 :" + this.lineNumber);
		System.out.println("승객수 :" + this.passengerCount);
		System.out.println("수익 금액 :" + this.money);
	}
}
