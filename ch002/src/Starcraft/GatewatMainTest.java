package Starcraft;

public class GatewatMainTest {

	public static void main(String[] args) {

		Gateway gateway1 = new Gateway();
		Zealot[] zealots = gateway1.createZealot(3);
		System.out.println(zealots[0]);
		System.out.println(zealots[1]);
		System.out.println(zealots[2]);




	}

}
