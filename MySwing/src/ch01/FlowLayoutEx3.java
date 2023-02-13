package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx3 extends JFrame {
// 멤버 변수를 선언할 수 있는가
// 배열을 활용할 수 있는가
// 생성자 + 메서드 호출
//for 문 활용할 수 있는가
// GUI 프로그램 익숙해 지기

	// 배열로 선언
	private JButton[] button = new JButton[8];

	private FlowLayout flowLayout;
//배치 관리자 FlowLayout 멤버 변수로 선언
// 화면에 Component 를 그려 주세요

	public FlowLayoutEx3() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("test4");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// for
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton("button" + (i + 1));
		}
		flowLayout = new FlowLayout(FlowLayout.RIGHT, 20, 20);
	}

	private void setInitLayout() {
		setLayout(flowLayout);
		// for
		for (int i = 0; i < button.length; i++) {
			add(button[i]);
		}
	}

	public static void main(String[] args) {
		new FlowLayoutEx3();
	}
}