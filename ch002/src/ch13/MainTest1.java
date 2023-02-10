package ch13;

public class MainTest1 {

	public static void main(String[] args) {
		Car aiCar = new AICar();
		aiCar.run();
		System.out.println("------------------");
		
		Car maualCar = new ManualCar();
		maualCar.run();
		

	}

}
