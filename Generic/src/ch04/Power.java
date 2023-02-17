package ch04;

public class Power extends Material{
	
	@Override
	public String toString() {
		return "재료는 파우더 입니다";
	}

	@Override
	public void doprinting() {
		System.out.println("power 재료로 출력 합니다");
		
	}
}
