package ch004;

public class Ink extends MakingBook{

	@Override
	public String toString() {
		System.out.println("재료는 Ink 입니다");
		return super.toString();
	}
	@Override
	public void Making() {
		System.out.println("재료로 잉크를 출력합니다");
		
	}

}
