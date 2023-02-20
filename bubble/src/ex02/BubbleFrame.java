package ex02;

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

		player = new Player();
	}

	private void setinitLayout() {
		setLayout(null); // 좌표기반
		setResizable(false);
		setLocationRelativeTo(null); // JFrame 가운데 배치
		setVisible(true);

		add(player);
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
					player.right();
					// 로직 작성
					break; // 세미 콜론
				case KeyEvent.VK_UP:
					player.up();
					break;
				case KeyEvent.VK_DOWN:
					player.down();
					break;

				}
			}// end of pressed
			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				
				case KeyEvent.VK_LEFT:
				// 왼쪽 버튼을 떼면 player는 멈춰야해	
					player.setLeft(false);
					break;
	
				case KeyEvent.VK_RIGHT:
				// 오른쪽 버튼을 떼면 player는 멈춰야해	
					player.setRight(false);
					break;
				
				}
				
			}
			
		});
	}

	public static void main(String[] args) {
		new BubbleFrame();

	}// end of main

}// end of class
