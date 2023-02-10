package Ex12;

public abstract class Computer {

	public abstract void display();
	
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원이 켜집니다");
	}
	
	public void turnOff() {
		System.out.println("전원이 꺼집니다");
	}
}
