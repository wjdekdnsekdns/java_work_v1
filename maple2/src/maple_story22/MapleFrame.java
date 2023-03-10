package maple_story22;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class MapleFrame extends JFrame {
	private Monster monster;
	private JLabel background;
	private Snail snail;
	private Snail2 snail2;
	private MapleFrame mContext = this;

	public MapleFrame() {
		initData();
		setInitLayout();
		addEventListener();
		
	}

	private void initData() {
		background = new JLabel(new ImageIcon("images/map/background1.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(background);
		setSize(1530, 1030);
		snail2 = new Snail2(mContext, MonsterWay.LEFT);
	}

	private void setInitLayout() {
		setLayout(null);
	//	add(snail);
		setVisible(true);
		add(snail2);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {

			}

		});
	}

	public static void main(String[] args) {
		new MapleFrame();
	}

}
