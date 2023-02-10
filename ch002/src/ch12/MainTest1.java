package ch12;

public class MainTest1 {

	public static void main(String[] args) {
		// 기본적으로 추상 클래스는 new 할 수 없다.
		// abstract --> 개발자 한테 직접 new 를 막아 버림
		//Animal animal = new Animal(); <- 추상 클래스
			Animal animalHuman = new Human();
			animalHuman.Hunt();
			System.out.println("-------------------");
			Animal animalPerson = new Person();
			animalPerson.Hunt();//런타임 시점에 person에 있는 메서드를 호출한다

	}

}
