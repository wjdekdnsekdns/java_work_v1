package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyKeyEvent1 extends JFrame implements KeyListener {

	private JTextArea area;

	public MyKeyEvent1() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);// 프레임 사이즈 조절 불가 설정
		area = new JTextArea();
	}

	private void setInitLayout() {
		add(area);
		setVisible(true);
	}

	private void addEventListener() {
		// KeyListenery keyListenery;
		area.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// System.out.println("ket type" + e.toString());

	}

	@Override
	public void keyPressed(KeyEvent e) {
System.out.println("keyPressed" + e.toString());
//제어문을  활용해서
// 방향기 위 가 눌러졌으면 콘솔에 up 이란 문자열 출력
//왼쪽 오른쪽 아래
	
	if(e.getKeyCode() == KeyEvent.VK_UP) {
		area.append("방향키 위\n");
		System.out.println("위");
	}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
		area.append("방향키 아래\n");
		System.out.println("아래");
	}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
		area.append("방향키 오른쪽\n");
		System.out.println("오른쪽");
	}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
		area.append("방향키 왼쪽\n");
		System.out.println("왼쪽");
	}
	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("ketReleased" + e.toString());
	}
}
