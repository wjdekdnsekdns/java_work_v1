
package ch04;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyImageFrame2 extends JFrame {

	private ImagePanel imagePanel; // 내부 클래스 멤버 변수로 선언
	private ImagePanel imagePanel2; // 내부 클래스 멤버 변수로 선언

	public MyImageFrame2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("이미지 연습");
		setSize(1100, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
		imagePanel2 = new ImagePanel();
	}

	private void setInitLayout() {
		add(imagePanel);
		add(imagePanel2);
		setVisible(true);
	}

	// 정적 - 내부 클래스
	static class ImagePanel extends JPanel {
		private Image image;
		private Image image2;

		public ImagePanel() {
			image = new ImageIcon("image3.png").getImage();
			image2 = new ImageIcon("image3.png").getImage();
		}
		int sum = 0;
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			for(int i = 0; i < 40; i++) {
				 sum += 10;
				g.drawImage(image, 0+sum, 0+sum, 20+sum, 20+sum, null);	
			}
//			g.drawImage(image, 100, 100, 100, 100, null);
//			g.drawImage(image, 120, 120, 120, 120, null);
//			g.drawImage(image2, 140, 140, 140, 140, null);
//			g.drawImage(image2, 160, 160, 160, 160, null);
//			g.drawImage(image2, 180, 180, 180, 180, null);
//			g.drawImage(image2, 200, 200, 200, 200, null);
//			g.drawImage(image2, 220, 220, 220, 220, null);
//			g.drawImage(image2, 240, 240, 240, 240, null);
//			g.drawImage(image2, 260, 260, 260, 260, null);
		}
	} // end of inner class
	
} // end of outer class
