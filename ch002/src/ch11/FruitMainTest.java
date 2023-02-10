package ch11;

public class FruitMainTest {

	public static void main(String[] args) {
		// 다양한 형태로 클래스(타입을) 바라 볼 수 있다 --> 다형성
		Frulit frulit1 = new Banana();// 업 캐스팅
		// 컴파일 시점에는 컴파일러가 앞에 선언된 데이터 타입만 확인한다.
		Frulit frulit2 = new Peach();// 업 캐스팅
		// 0 , 1
		Frulit[] frulits = new Frulit[2];
		frulits[0] = frulit1;
		frulits[1] = frulit2;
		// 다운 캐스팅
		String bananaOrigin = ((Banana) frulit1).origin;// 강제 형 변환
		//String bananaName = ((Banana) frulit1).name;// 강제 형 변환
		System.out.println(bananaOrigin);

		// 반복문
		//instanceof
		for (int i = 0; i < frulits.length; i++) {
			frulits[i].showInfo();
			if(frulits[i] instanceof Banana) {
				//바나나 타입이 맞다면 여기 코드 안으로 들어온다
				//다운 캐스팅 가능
				String origin = ((Banana)frulits[i]).origin;
				System.out.println("바나나 원산지 : " + origin);
			}
//			// 바나나 이면 원산지를 출력 하시오
//			System.out.println("----------------");
//			//if(frulits[0] == frulit1)//주소값 == 주소값
//			if (frulit1.name.equals(bananaName)) {
//				System.out.println(bananaOrigin);
//			}
		}

	}

}
