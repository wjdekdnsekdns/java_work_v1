package ch08;

public class MainTest2 {

	public static void main(String[] args) {

		//예외 처리 구문 작성
		//10/0 연산 시키고 예외 처리 까지 작성해 주세요
	
		try {
			int k =10/0;
			System.out.println(k);
		} catch (Exception e) {
			System.out.println("두번째 값에 0을 넣지 마세요");
		}
	

	}
}

//던질려면 클래스 설계해서 하기

class TrycatchEx{
	public int tyrEx(int n1, int n2) {
		n1 =10;
		n2 = 0;
		return n1/n2;
	}
}