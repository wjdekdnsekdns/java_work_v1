package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx2 extends JFrame{
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	
	public NoLayoutEx2() {
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("좌표 연습 2");
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("bt1");
		button2 = new JButton("bt2");
		button3 = new JButton("bt3");
		button4 = new JButton("bt4");
		button1.setSize(100, 100);
		button2.setSize(100, 100);
		button3.setSize(100, 100);
		button4.setSize(100, 100);
	}
	private void setInitLayout() {
		setLayout(null);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		button1.setLocation(100 , 100);
		button2.setLocation(200 , 100);
		button3.setLocation(100 , 200);
		button4.setLocation(200 , 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new NoLayoutEx2();
	}
}
