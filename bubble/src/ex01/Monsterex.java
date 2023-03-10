package ex01;

import javax.swing.ImageIcon;


import javax.swing.JLabel;


public class Monsterex extends JLabel implements Moveable{

	private int x;
	private int y;

	private ImageIcon playerR, playerL;

	public Monsterex() {
		initData();
		setInitlayout();
	}

	private void initData() {
		playerR = new ImageIcon("images/move.png");
		playerL = new ImageIcon("images/move.png");
		
	}

	private void setInitlayout() {
	
		x = 55;
		y = 335;
		// 좌표기반, 라벨의 크기를 지정해야 한다
		setSize(50, 50);
		setLocation(x,y);
		// JLabel 에 아이콘을 셋팅하는 메서드
		setIcon(playerR);
	}

	@Override
	public void left() {
		setIcon(playerL);
		x -= 10;
		setLocation(x, y);
	}

	@Override
	public void lright() {
		setIcon(playerR);
		x += 10;
		setLocation(x, y);
	}

	@Override
	public void up() {
		System.out.println("점프 !");
		
	}

	@Override
	public void down() {
		System.out.println("p down");
		
	}

}
