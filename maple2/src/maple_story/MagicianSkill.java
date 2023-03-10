package maple_story;

import javax.swing.ImageIcon;

public class MagicianSkill extends Skill implements MonsterMove {

	private ImageIcon energyBall;
	private final int SKILL_SPEED = 5;

	// 몬스터 맞춘 상태 : 0 기본값   
	// 몬스터 죽은 상태 : 1
	private int state;
	public MagicianSkill(MapleFrame mContext) {
		super(mContext);
	}

	@Override
	void initData() {
		energyBall = new ImageIcon("images/skills/Magician0.png");
		state = 0;
	}

	@Override
	void setInitLayout() {
		x = mContext.getCharacter().getX();
		y = mContext.getCharacter().getY();
		setIcon(energyBall);
		setSize(164, 164);
		setLocation(x, y);
	}

	@Override
	void initThread() {
		// TODO Auto-generated method stub

	}

	@Override
	void used() {
	}

	@Override
	public void left() {
		left = true;
		for (int i = 0; i < 400; i++) {
			x -= SKILL_SPEED;
			setLocation(x, y);

			// 적 위치 감지
//			if(Math.abs(x - mContext.getSnail().getX()) < 10
//					&& Math.abs(y - mContext.getSnail().getY()) < 50) {
//				if(mContext.getSnail().getState() == 0) {
//					setIcon(null);
//				}
//				
//			}
			// Math.abs(x - mContext.getSnail().getX()) < 10
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public void right() {
		right = true;
		for (int i = 0; i < 400; i++) {
			x++;
			setLocation(x, y);
			
//			if(Math.abs(x - mContext.getEnemy().getX()) < 10
//					&& Math.abs(y - mContext.getEnemy().getY()) < 50) {
//				if(mContext.getEnemy().getState() == 0) {
//					crash();
//				}
//			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	// 신경 안써도 상관없음
	@Override
	public void die() {
		
	}

	

}
