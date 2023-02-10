package ch05;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;
	int endmoney;

	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	// 기능
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}

	public void showInfo() {
		System.out.println("승객번호 :" + this.busNumber);
		System.out.println("승객수 :" + this.passengerCount);
		System.out.println("수익 금액 :" + this.money);
	}

}
