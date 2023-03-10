package ch01;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MapleFrame extends JFrame implements Moveable {
	private Monster monster;
	private JLabel player;
	private JLabel background;
	private int playerX;
	private int playerY;
	private int bgX;
	private int bgY;
	
	
	public MapleFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(1530,1530);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Icon icon = new ImageIcon("images/player.png");
		player = new JLabel(icon);
		player.setSize(150,250);
		background = new JLabel(new ImageIcon("images/맵1/20230223075307376_100020100.png"));
		background.setSize(1530,1350);
		
	}

	private void setInitLayout() {
		setLayout(null);
		add(player);
		add(background);
		add(monster);
		playerX = 100;
		playerY = 150;
		player.setLocation(playerX,playerY);
		bgX = 0;
		bgY = 0;
		background.setLocation(bgX,bgY);
		setVisible(true);
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
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					right();
				}else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					
					left();
					
				}else if (e.getKeyCode() == KeyEvent.VK_UP) {
					up();
				}else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					down();
				}
			}
		});
	}

	@Override
	public void left() {
		bgX += 10;
		int x = playerX -= 10;
		int y = playerY;
		if (x < 0) {
			x = 0;
			playerX = 0;
		}
		
		player.setLocation(x,y);
		background.setLocation(bgX,bgY);
	}

	@Override
	public void right() {
		bgX -= 10;
		int x = playerX += 10;
		int y = playerY;
		if (x > 1500) {
			x = 1500;
			playerX = 800;
		}
		
		player.setLocation(x,y);
		background.setLocation(bgX,bgY);
	}

	@Override
	public void up() {
		bgY += 10;
		int x = playerX;
		int y = playerY -= 10;
		if (y < 0) {
			y = 0;
			playerY = 0;
		}
		player.setLocation(x,y);
		background.setLocation(bgX,bgY);
	}

	@Override
	public void down() {
		bgY -= 10;
		int x = playerX;
		int y = playerY += 10;
		if (y > 1350) {
			y = 1350;
			playerY = 450;
		}
		
		player.setLocation(x,y);
		background.setLocation(bgX,bgY);
	}
	public static void main(String[] args) {
		new MapleFrame();
	}
}
