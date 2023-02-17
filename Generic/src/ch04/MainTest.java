package ch04;

public class MainTest {
	public static void main(String[] args) {
		
		GenericPrint<Power> genericPrint1 = new GenericPrint<>();
		GenericPrint<Plastic> genericPrint2 = new GenericPrint<>();
	//	GenericPrint<Water> genericPrint3 = new GenericPrint<>();
	
		// 재료 넣기
		genericPrint1.setMaterial(new Power());
		genericPrint2.setMaterial(new Plastic());
	
		//문제
		// 제네릭을 활용한 프로그램을 작성하고 테스트 해주세요
	
	}
}
