package ch04;

public class Plastic extends Material{
	@Override
	public String toString() {
		return "재료는 플라스틱 입니다";
	}

	@Override
	public void doprinting() {
		System.out.println("plastic 으로 출력 합니다");
		
	}
}
