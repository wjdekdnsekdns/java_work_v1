package ch01;

import javax.swing.JFrame;

public class MyFrame  extends JFrame{
	public MyFrame() {
		super.setTitle("MyFame01");
		// width, height
		super.setSize(200, 800);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// 코드 테스트
	public static void main(String[] args) {
		new MyFrame();
		//GUI 관련 프로그램 학습시에 배치 관리자 먼저 명확이 이해 하는것이 좋다
		//레이아웃 --> Button <-- 
	}
}
