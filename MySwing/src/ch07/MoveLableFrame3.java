package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveLableFrame3 extends JFrame{
	private JLabel image1;
	private int imagePosX;
	private int imagePosY;
	
	public MoveLableFrame3() {
		initData();
		setInitLayout();
		addEventListener();
		imagePosX=300;
		imagePosY=350;
	}
	
	private void initData() {
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Icon icon = new ImageIcon("image2.png");
		image1 = new JLabel(icon);
		image1.setSize(110,160);
	};
	private void setInitLayout() {
		setLayout(null);
		image1.setLocation(300,350);
		add(image1);
		setVisible(true);
	};
	
	private void addEventListener() {
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					if((imagePosX+50) < 700) {
						int x = imagePosX += 50;			
						int y = imagePosY;
						image1.setLocation(x,y);
						System.out.println(x);
					}
				}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					if((imagePosX) > 0) {
						int x = imagePosX -= 50;			
						int y = imagePosY;
						image1.setLocation(x,y);
					}
				}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					if((imagePosY+50) < 650) {
						int x = imagePosX;			
						int y = imagePosY += 50;
						image1.setLocation(x,y);
					}
				}else if(e.getKeyCode() == KeyEvent.VK_UP) {
					if((imagePosY) > 0) {
						int x = imagePosX;			
						int y = imagePosY -= 50;
						image1.setLocation(x,y);
					}
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}