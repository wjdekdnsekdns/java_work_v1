package maple_story;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import maple_story22.MonsterWay;

public class MapleFrame extends JFrame implements Moveable {

	private MapleFrame mContext = this;
	private Character character;
	private JLabel background;
	private BackgroundPlayerService backgroundPlayerService;
	private Map map;
	private Snail snail;
	private BlueSnail blueSnail;
	private RedSnail redSnail;
	
	public Snail getSnail() {
		return snail;
	}

	public void setSnail(Snail snail) {
		this.snail = snail;
	}

	public BlueSnail getBlueSnail() {
		return blueSnail;
	}

	public void setBlueSnail(BlueSnail blueSnail) {
		this.blueSnail = blueSnail;
	}

	public RedSnail getRedSnail() {
		return redSnail;
	}

	public void setRedSnail(RedSnail redSnail) {
		this.redSnail = redSnail;
	}

	public MapleFrame getmContext() {
		return mContext;
	}

	public void setmContext(MapleFrame mContext) {
		this.mContext = mContext;
	}

	public BackgroundPlayerService getBackgroundPlayerService() {
		return backgroundPlayerService;
	}

	public void setBackgroundPlayerService(BackgroundPlayerService backgroundPlayerService) {
		this.backgroundPlayerService = backgroundPlayerService;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public void setBackground(JLabel background) {
		this.background = background;
	}

	public MapleFrame() {
		initData();
		setInitLayout();
		addEventListener();
		new Thread(backgroundPlayerService).start();
	}

	private void initData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1400, 850);
		map = new Map(mContext);
		character = new Magician(this);
		backgroundPlayerService = new BackgroundPlayerService(this);
		snail = new Snail(mContext, maple_story.MonsterWay.LEFT);
		blueSnail = new BlueSnail(mContext, maple_story.MonsterWay.LEFT);
		redSnail = new RedSnail(mContext, maple_story.MonsterWay.LEFT);
	}

	private void setInitLayout() {
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(true);
		add(character);
		add(snail);
		add(blueSnail);
		add(redSnail);
		add(map);
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					character.setRight(false);
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					character.setLeft(false);

				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					character.setUp(false);

				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					character.setDown(false);
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					if (!character.isRight()) {
						character.right();
					}
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					if (!character.isLeft()) {
						character.left();
					}
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					
				} else if (e.getKeyCode() == KeyEvent.VK_CONTROL) {

				} else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					if (!character.isFall() && !character.isJump()) {
						character.jump();
					}
				} else if (e.getKeyCode() == KeyEvent.VK_1) {
				} else if (e.getKeyCode() == KeyEvent.VK_2) {
				} else if (e.getKeyCode() == KeyEvent.VK_3) {
				} else if (e.getKeyCode() == KeyEvent.VK_4) {
				}

			}
		});
	}

	@Override
	public void left() {

	}

	@Override
	public void right() {

	}

	@Override
	public void up() {

	}

	@Override
	public void down() {

	}

	@Override
	public void jump() {

	}

	@Override
	public void item1() {

	}

	@Override
	public void item2() {

	}

	@Override
	public void item3() {

	}

	@Override
	public void item4() {

	}

	public static void main(String[] args) {
		new MapleFrame();
	}

}
