package ch05;

import java.lang.annotation.Target;

public class Student {

	String name;
	int money;

	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}

	// 학생이 버스를 탄다

	public void takeBus(Bus targetBus) {
		System.out.println("targetBus 메서드 실행됨");
		// 요금 넣어야 함

		targetBus.take(1_000);
		this.money -= 1000;
	}

	// 학생이 지하철을 탄다
	public void takeSubway(Subway1 targetSubway) {
		System.out.println("takeSubway 메서드 실행 됨");
		targetSubway.take(1_200);
		this.money -= 1_200;
	}

	// 상태창 보기
	public void showInfo() {
		System.out.println("학생의 이름은 :" + this.name);
		System.out.println("학생의 소지금 :" + this.money);
		System.out.println("---------------------");
	}

}
