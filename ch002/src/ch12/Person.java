package ch12;

public class Person extends Human {
	@Override
	public void Hunt() {
		//100줄 부모 메서드와 똑같아야 함
		super.Hunt();// 부모에 있는 메서드를 호출 하라
		System.out.println("야는 사람이야 !!! ");
	}
}
