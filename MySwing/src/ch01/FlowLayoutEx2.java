package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx2 extends JFrame{

//1 단계 Jbutton 2개 생성
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private FlowLayout flowLayout;
//배치 관리자 FlowLayout 멤버 변수로 선언
// 화면에 Component 를 그려 주세요
	
	public FlowLayoutEx2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("test2");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// for
		//for()
		button1 = new JButton("button1");
	
		flowLayout = new FlowLayout(FlowLayout.RIGHT, 20, 20);
	}

	private void setInitLayout() {
		setLayout(flowLayout);
		// for
		add(button1);
		add(button2);
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx2();
	}
}