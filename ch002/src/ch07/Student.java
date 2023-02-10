package ch07;

public class Student {
	String name;
	int money;
	
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus() {
		this.money -= 1_000;
	}
	public void takeSubway() {
		this.money -= 1_200;
	}
	 public void showInfo() {
		 System.out.println( name + "남은 금액은 : " + money);
	 }
}
