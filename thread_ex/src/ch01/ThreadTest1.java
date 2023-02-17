package ch01;

public class ThreadTest1 {
	// 메인 쓰레드
	public static void main(String[] args) {
		
		for(int i = 0; i <30; i++) {
			//System.out.print("i : " + i + "\t");
			System.out.print("-");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}// end of main

}// end of class
