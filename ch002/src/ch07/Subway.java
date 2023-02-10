package ch07;

public class Subway {

	int subwayNumber;
	int money;
	
	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	public  void take(int money) {
		this.money += money;
	}
	public void showInfo() {
		System.out.println("이용한 지하철 노선은 : " + subwayNumber);
	}
}
