package Starcraft2;

import java.util.Iterator;

public class MainTest1 {

	public static void main(String[] args) {

		Zealot zealot1 = new Zealot("천하무적 질럿1");
		Zealot zealot2 = new Zealot("질럿2");
		Marine marine1 = new Marine("귀신잡는 해병1");
		Marine marine2 = new Marine("마린2");
		Zerging zerging1 = new Zerging("저글링1");
		Zerging zerging2 = new Zerging("저글링2");

		// 질럿이 마린을 공격 - 대상 1, 2
		
//		for (int i = 0; i < 16; i++) {	
//			zealot1.attackMarin(marine2);
//		}
		zealot1.upGradeat();
		zealot1.attackMarin(marine1);
		System.out.println(zealot1.getHp());
		zealot1.showInfo();
		marine1.showInfo();
		
	}

}