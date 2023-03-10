package ch01;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Monster extends JLabel implements Moveable{

	// 살아있는 상태, 물방울에 죽은 상태
	private int state;

	// 위치 상태
	private int x;
	private int y;

	// 움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;

	// 적군 속도 상태
	private final int SPPED = 3;
	private final int JUMPSPPED = 1;

	// 적군 이미지
	private ImageIcon enemyR, enemyL;

	public Monster() {
		initData();
		setInitLayout();
	}

	private void initData() {
		enemyR = new ImageIcon("images/Dalpang/move/move.0.png");
		enemyL = new ImageIcon("images/Dalpang/move/move.0.png");
		x = 720;
		y = 175;
		left = false;
		right = false;
		state = 0;
	}

	private void setInitLayout() {
		setIcon(enemyL);
		setSize(50, 50);
		setLocation(x, y);
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Override
	public void left() {
		left = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					x -= SPPED;
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		}).start();;

	}

	@Override
	public void right() {
		right = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					x += SPPED;
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		}).start();;

	}

	@Override
	public void up() {

	}

	@Override
	public void down() {

	}

}
