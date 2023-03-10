package maple_story111;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Monster extends JLabel implements MonsterMove {

	MapleFrame mContext;
	// 살아 있는 상태 (0) 죽은상태(1)
	protected int x;
	protected int y;

	// 움직임 상태
	protected ImageIcon[] monsterL = new ImageIcon[3];
	protected ImageIcon[] monsterR = new ImageIcon[3];
	protected ImageIcon[] monsterDie = new ImageIcon[3];

	protected boolean left;
	protected boolean right;

	// 적군 속도 상태
	protected final int SPEED = 3;

	// 몬스터 스탯
	protected int maxHp;
	protected int monsterHp;
	protected int power;

	// 배열 숫자
	protected int arrN;

	public Monster(MapleFrame mContext) {
		this.mContext = mContext;

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public ImageIcon[] getMonsterL() {
		return monsterL;
	}

	public void setMonsterL(ImageIcon[] monsterL) {
		this.monsterL = monsterL;
	}

	public ImageIcon[] getMonsterR() {
		return monsterR;
	}

	public void setMonsterR(ImageIcon[] monsterR) {
		this.monsterR = monsterR;
	}

	public ImageIcon[] getMonsterDie() {
		return monsterDie;
	}

	public void setMonsterDie(ImageIcon[] monsterDie) {
		this.monsterDie = monsterDie;
	}

	public boolean isLeft() {
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getHp() {
		return monsterHp;
	}

	public void setHp(int hp) {
		monsterHp = hp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getSPEED() {
		return SPEED;
	}

	@Override
	public void left() {
		left = true;
		right = false;
		arrN = 1;
		setIcon(monsterL[1]);
		new Thread(() -> {
			while (left) {
				x -= SPEED;
				setLocation(x, y);
				try {
					Thread.sleep(10);
					setIcon(monsterL[arrN]);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				arrN += 1;
				if (arrN > 2) {
					arrN = 0;
				}

			}
		}).start();
		;

	}

	@Override
	public void right() {
		right = true;
		left = false;
		arrN = 1;
		setIcon(monsterR[1]);
		new Thread(() -> {
			while (right) {
				x += SPEED;
				repaint();
				setLocation(x, y);
				try {
					Thread.sleep(70);
					setIcon(monsterR[arrN]);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				arrN += 1;
				if (arrN > 2) {
					arrN = 0;
				}

			}
		}).start();
		;

	}

	public void monsterHp() {
		if (monsterHp == 0) {

		}
	}
}
