package maple_story22;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Monster extends JLabel implements MonsterMove {

	protected boolean left;
	protected boolean right;

	protected int x;
	protected int y;

	// 움직임 상태
	protected ImageIcon monsterL = new ImageIcon();
	protected ImageIcon monsterR = new ImageIcon();
	

	// 적군 속도 상태
	protected final int SPEED = 3;

	// 몬스터 스탯
	protected int maxHp;
	protected int monsterHp;
	protected int power;


	public Monster() {
		
	}

	

	@Override
	public void left() {
		left = true;
		right = false;
		setIcon(monsterL);
		new Thread(() -> {
			while (left) {
				x -= SPEED;
				setLocation(x, y);
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(x);
			}
		}).start();
		;

	}

	@Override
	public void right() {
		right = true;
		left = false;
		setIcon(monsterR);
		new Thread(() -> {
			while (right) {
				x += SPEED;
				setLocation(x, y);
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(x);

			}
		}).start();
		;
	}

	public void move() {
			
		}
	}

