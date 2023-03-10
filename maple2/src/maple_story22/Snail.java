package maple_story22;

import javax.swing.ImageIcon;

public class Snail extends Monster implements MonsterMove{

	Monster monster;

	public Snail() {
		initData();
		setInitlayout();
		//left();
		//right();
	}

	private void initData() {
		monsterL = new ImageIcon("images/snailmove.gif");
		monsterR = new ImageIcon("images/snailmove.gif");
	}

	private void setInitlayout() {
		setSize(50, 50);
		x = 800;
		y = 450;
		setLocation(x, y);
		
	}
}
