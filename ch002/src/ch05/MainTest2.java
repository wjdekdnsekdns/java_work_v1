package ch05;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {
		// 객체 생성
		// 1단계 - 사용해보기
		Student studentLee = new Student("Lee", 8_000);
		Bus bus52 = new Bus(52);
		Bus bus31 = new Bus(31);
		Subway1 subwayLine1 = new Subway1(1);
		Subway1 subwayLine2 = new Subway1(2);

		studentLee.showInfo();
		bus52.showInfo();
		bus31.showInfo();
		System.out.println("-----------");
		studentLee.takeSubway(subwayLine1);
		studentLee.showInfo();
		subwayLine1.showInfo();

		// 2단게 - 실행에 흐름 만들어 보기
		Scanner sc = new Scanner(System.in);
		System.out.println("어떤것을 탈지 선택하시오");
	

	}

}
