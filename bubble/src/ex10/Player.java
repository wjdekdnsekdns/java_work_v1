package ex10;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable {
	
	BubbleFrame mContext;
	private int x;
	private int y;

	private ImageIcon playerR, playerL;

	// 플레이어에 방향 상태 ( enum 타입 사용 데이터의 범주화
	private PlayerWay pWay;

	// 플래이어에 현재 움직임 상태를 기록
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	// 벽에 충돌한 상태
	private boolean leftWallCrash;
	private boolean rightWallCrash;
	private boolean topWallCrush;

	// 플레이어 속도 상태
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;

	public Player(BubbleFrame mContext) {
		this.mContext = mContext;
		initData();
		setInitlayout();
	}
	// getter 메서드 추가 left, right isLeftWallCrash 추가

	public PlayerWay getpWay() {
		return pWay;
	}

	public void setpWay(PlayerWay pWay) {
		this.pWay = pWay;
	}

	// setter method
	public void setLeft(boolean left) {
		this.left = left;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public boolean isLeftWallCrash() {
		return leftWallCrash;
	}

	public void setLeftWallCrash(boolean leftWallCrash) {
		this.leftWallCrash = leftWallCrash;
	}

	public boolean isRightWallCrash() {
		return rightWallCrash;
	}

	public void setRightWallCrash(boolean rightWallCrash) {
		this.rightWallCrash = rightWallCrash;
	}

	public boolean isTopWallCrush() {
		return topWallCrush;
	}

	public void setTopWallCrush(boolean topWallCrush) {
		this.topWallCrush = topWallCrush;
	}

	public boolean isLeft() {
		return left;
	}

	public boolean isRight() {
		return right;
	}

	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	private void initData() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
		left = false;
		right = false;
		up = false;
		down = false;
		leftWallCrash = false;
		rightWallCrash = false;
		pWay = PlayerWay.RIGHT;
	}

	private void setInitlayout() {

		x = 500;
		y = 535;
		// 좌표기반, 라벨의 크기를 지정해야 한다
		setSize(50, 50);
		setLocation(x, y);
		// JLabel 에 아이콘을 셋팅하는 메서드
		setIcon(playerR);
	}

	@Override
	public void left() {
		left = true;
		pWay = PlayerWay.LEFT;
		// 한번 키보드 왼쪽 방향키를 누르면
		// 쓰레드 생성이 된다
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (left) {
					setIcon(playerL);
					x -= SPEED;
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of while

			}
		}).start();
	}

	@Override
	public void right() {
		right = true;
		pWay = PlayerWay.RIGHT;
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (right) {
					setIcon(playerR);
					x += SPEED;
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		}).start();
	}

	@Override
	public void up() {
		up = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 130 / JUMPSPEED; i++) {
					y -= JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of for
				up = false;
				down();
			}
		}).start();
	}

	@Override
	public void down() {
		down = true;
		new Thread(new Runnable() {

			@Override
			public void run() {

				while (down) {
					y += JUMPSPEED;
					setLocation(x, y);
					

					try {
						Thread.sleep(3);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				down = false;
				// 상태값 다룰 떄는 상황이 변하면 초기화 처리를 잘 해야함
			}
		}).start();

	}
public void attack() {
	Bubble bubble = new Bubble(mContext);
	mContext.add(bubble);
	
	
}
}
