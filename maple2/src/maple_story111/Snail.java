package maple_story111;

import javax.swing.ImageIcon;

public class Snail extends Monster {

	public Snail(MapleFrame mContext) {
		super(mContext);
		initData();
		setInitlayout();
		left();
	}
 
	private void initData() {
		monsterL[0] = new ImageIcon("images/snail/move/move.0.png");
		monsterL[1] = new ImageIcon("images/snail/move/move.1.png");
		monsterL[2] = new ImageIcon("images/snail/move/move.2.png");

		monsterR[0] = new ImageIcon("images/snail/move/moveR.0-removebg-preview.png");
		monsterR[1] = new ImageIcon("images/snail/move/moveR.1-removebg-preview.png");
		monsterR[2] = new ImageIcon("images/snail/move/moveR.2-removebg-preview.png");
	}

	private void setInitlayout() {
		setSize(50, 50);
		x = 700;
		y = 700;
		setLocation(x, y);
		setIcon(monsterR[1]);
	}
	
}