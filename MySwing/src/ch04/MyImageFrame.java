package ch04;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.font.ImageGraphicAttribute;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

//swing 이미지를 다루는 방법은 3가지 정도
//JLable <-- String, Image()
public class MyImageFrame extends JFrame {
	ImagePanel imagePanel;// 내부 클래스를 멤버 변수로 선언
	// JPanel 안에 이미지를 넣는 방법
	// 내부 클래스 이용해 보기
	class ImagePanel extends JPanel {
		
		

		private Image image;

		public ImagePanel() {
			image = new ImageIcon("image1.png").getImage();
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			// 대상 <-- image
			// x, y, 가로 길이, 세로 길이
			g.drawImage(image, 0, 0, 400, 400, null);
		}
	}// end of inner class

	public MyImageFrame() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("이미지 연습");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
	}

	private void setInitLayout() {
		setVisible(true);
		add(imagePanel);
	}

}
