package ch03;

public class MainTest1 {

	public static void main(String[] args) {
		// 외부 파일에서 MyDrawPanel 사용할 일이 없고
		// MyFrame1 에서만 사용하는 녀석이라면 내부 클래스로 설계할 수 있다
		new MyFrame1();
	}

}
