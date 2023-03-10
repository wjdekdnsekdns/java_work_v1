package maple_story;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BackgroundPlayerService implements Runnable {

	private BufferedImage image;
	MapleFrame mContext;

	public BackgroundPlayerService(MapleFrame mContext) {
		this.mContext = mContext;
		try {
			image = ImageIO.read(new File("images/map/backgroundmap.png"));
		} catch (IOException e) {
			System.out.println("이미지 경로를 찾을 수 없습니다.");
		}
	}
	

	@Override
	public void run() {
		while (true) {
			Color bottomColor = new Color(image.getRGB(mContext.getCharacter().getX() + 50, mContext.getCharacter().getY() + 80));
			Color bottomColorLeft = new Color(image.getRGB(mContext.getCharacter().getX() , mContext.getCharacter().getY() + 80));
			Color bottomColorRight = new Color(image.getRGB(mContext.getCharacter().getX() + 100, mContext.getCharacter().getY() + 80));
			System.out.println(bottomColorLeft.getRed() +""+ bottomColorLeft.getGreen() +""+ bottomColorLeft.getBlue());
			System.out.println(bottomColorRight.getRed() +""+ bottomColorRight.getGreen() +""+ bottomColorRight.getBlue());
			System.out.println("==============================================================");
//			Color leftColor = new Color(image.getRGB(mContext.getCharacter().getX() , mContext.getCharacter().getY()));
//			Color rightColor = new Color(image.getRGB(mContext.getCharacter().getX() + 200 , mContext.getCharacter().getY()));
//			Color centerColor = new Color(image.getRGB(mContext.getCharacter().getX() + 100 , mContext.getCharacter().getY()));
			if ((bottomColorLeft.getRed() == 255 && bottomColorLeft.getBlue() == 0 && bottomColorLeft.getGreen() == 0) 
					|| (bottomColorRight.getRed() == 255 && bottomColorRight.getBlue() == 0 && bottomColorRight.getGreen() == 0)) {
				mContext.getCharacter().setFall(false);
			} else {
				if (mContext.getCharacter().isJump() == false && mContext.getCharacter().isFall() == false) {
					mContext.getCharacter().fall();
				}
			}
			
//			if (leftColor.getRed() == 255 && leftColor.getBlue() == 0 && leftColor.getGreen() == 0) {
//			}
//			
//			if (rightColor.getRed() == 255 && rightColor.getBlue() == 0 && rightColor.getGreen() == 0) {
//			}
//			
//			
//			if ((bottomColor.getRed() == 0 && bottomColor.getGreen() == 255 && bottomColor.getBlue() == 0)
//					|| (centerColor.getRed() == 0 && centerColor.getGreen() == 255 && centerColor.getBlue() == 0)) {
//				mContext.getCharacter().setUp(true);
//				mContext.getCharacter().setDown(true);
//			} else {
//				mContext.getCharacter().setLadder(false);
//			}
			
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} // end of while

	}

//	
//	private JLabel label;
//	private JLabel background;
//	private Player player;
//	private MapleFrame mapleFrame;
//	
//	public BackgroundPlayerService(Player player) {
//		this.player = player;
//		background = new JLabel(new ImageIcon("images/맵1/backgroundmap.png"));
//		background.setSize(1000,800);
//		background.setLocation(mapleFrame.getBgX(),mapleFrame.getBgY());
//		//setLocation(mapleFrame.getx, mapleFrame.gety)
//	}
//
//	@Override
//	public void run() {
//	
//		background.setLocation(mapleFrame.getBgX(), mapleFrame.getBgY());
//		repaint();
//			//setlo(mapleFrame.getBgX(), mapleFrame.getBgX());
//			 //repaint
//		
//		
//	}
//
//		
//	
//}

}