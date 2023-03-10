package ex01;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.SocketException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {

	private JLabel backgroundMap;
	private Player player;
	private Monsterex monster; 
	public BubbleFrame() {
		initData();
		setinitLayout();
		addEventListener();
	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap);
		setSize(1000, 640);
		monster = new Monsterex();
		player = new Player();
	}

	private void setinitLayout() {
		setLayout(null); // 좌표기반
		setResizable(false);
		setLocationRelativeTo(null); // JFrame 가운데 배치
		setVisible(true);

		add(player);
		add(monster);
	}

	private void addEventListener() {

		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					player.left();
					break;
				case KeyEvent.VK_RIGHT:
					player.lright();
					// 로직 작성
					break; // 세미 콜론
				case KeyEvent.VK_UP:
					player.up();
					break;
				case KeyEvent.VK_DOWN:
					player.down();
					break;

				}
			}
		});
	}

	public static void main(String[] args) {
		new BubbleFrame();

	}// end of main

}// end of class
