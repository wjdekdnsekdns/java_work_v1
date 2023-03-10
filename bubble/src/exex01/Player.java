package exex01;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel  implements Moveable {

	private int x;
	private int y;
	private ImageIcon playerR, playerL;
	
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;
	
	public Player() {
		initData();
		setInitLayout();
	}
	

	public void setLeft(boolean left) {
		this.left = left;
	}


	public void setRight(boolean right) {
		this.right = right;
	}


	private void initData() {
	playerR = new ImageIcon("images/playerR.png");
	playerL = new ImageIcon("images/playerL.png");
	}

	private void setInitLayout() {
		x = 55;
		y = 535;
		setSize(50, 50);
		setLocation(x, y);
		setIcon(playerR);
	}

	@Override
	public void left() {
		left = true;
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {

			
				while(left) {
					setIcon(playerL);
					x -= SPEED;
					setLocation(x, y);
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();;

	}

	@Override
	public void right() {
		right = true;
		new Thread(new Runnable() {
			
			@Override
			public void run() {
			while(right) {
				setIcon(playerR);
				x += SPEED;
				setLocation(x, y);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
			}
		}).start();;
	}

	@Override
	public void up() {
		// TODO Auto-generated method stub

	}

	@Override
	public void down() {
		// TODO Auto-generated method stub

	}

}
