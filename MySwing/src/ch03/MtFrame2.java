package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MtFrame2 extends JFrame {

	// 내부 클래스 활용해서
	// JPanel 를 상속 받고 paint 메서드로
	// 집 그림을 그려보세요
	// cafe --> 결과 사진 같이
	DrawPanel drawPanel;
	class DrawPanel extends JPanel {
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawRect(200, 300, 200, 200);
			//지붕
			g.drawLine(300, 150, 500, 300);
			g.drawLine(300, 150, 100, 300);
			g.drawLine(100, 300, 500, 300);
			//창문
			g.drawRect(250, 350, 50, 50);
			g.drawLine(250, 375, 300, 375);
			g.drawLine(250, 377, 300, 377);
			g.drawLine(250, 377, 300, 377);
		}
	}

	public MtFrame2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("집 만들기");
		setSize(700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new DrawPanel();
	}

	private void setInitLayout() {
		add(drawPanel);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MtFrame2();
	}
}
