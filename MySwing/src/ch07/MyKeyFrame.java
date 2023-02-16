package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyKeyFrame extends JFrame{
	JTextArea area;

	private KeyListener keyListener = new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			
			
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
		System.out.println(e.getKeyCode());
			
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			
			
		}
	};
	// 1. 구현처리 impel
	// 2. 익명 클래스
	public MyKeyFrame() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
	}

	private void setInitLayout() {
		add(area);
		setVisible(true);
	}

	private void addEventListener() {
	
	}
	public static void main(String[] args) {
		new MyKeyFrame();
	}
}
