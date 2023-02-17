package ch02;

public class MainTest1 {

	public static void main(String[] args) {
		// 현재 잔액 100_000원
		BankAccount bankAccount = new BankAccount(); 
		
	//	Father father = new Father(bankAccount);
		Mother mother = new Mother(bankAccount);
		
		// 아버지 입금하기
	//	father.start(); // 3초 걸린다 설계
		// 어머니 출금
		mother.start();
		
		// 정상 처리 : 10 +1만원 -5천원 == 10만 5천원 <-- 정상동작
			
	}

}
