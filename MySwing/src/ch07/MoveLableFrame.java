package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveLableFrame extends JFrame {

	private JLabel labelText;
	private int labelTextX;
	private int labelTextY;

	public MoveLableFrame() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		// 초기 값 세팅
		labelTextX = 300;
		labelTextY = 350;
		labelText = new JLabel("Hellow World");
		labelText.setSize(100, 100);
	}

	private void setInitLayout() {
		setLayout(null);
		labelText.setLocation(labelTextX, labelTextY);
		add(labelText);
		setVisible(true);

	}

	private void addEventListener() {
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// 현재 이벤트가 일어난 시점에 x,y 좌표값을 확인
//				int cureentX = labelText.getX();
//				int cureentY = labelText.getX();
				e.getKeyCode();

				if (labelTextX != 700) {
					if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
						int x = labelTextX += 50;
						int y = labelTextY;
						labelText.setLocation(x, y);
					}

				} else if (labelTextX != 0) {
					if (e.getKeyCode() == KeyEvent.VK_LEFT) {
						int x = labelTextX -= 50;
						int y = labelTextY;
						labelText.setLocation(x, y);
					}
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {

					labelText.setLocation(labelTextX, labelTextY -= 50);
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {

					labelText.setLocation(labelTextX, labelTextY += 50);

				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}
}
