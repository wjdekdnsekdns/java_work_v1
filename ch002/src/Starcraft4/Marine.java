package Starcraft4;

public class Marine extends Unit{



	public Marine(String name) {
		this.name = name;
		this.power = 4;
		this.hp = 70;
	}

	public int getPower() {
		return this.power;
	}

	public String getName() {
		return this.name;
	}


}
