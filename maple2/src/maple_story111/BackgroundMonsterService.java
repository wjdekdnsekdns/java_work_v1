package maple_story111;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BackgroundMonsterService implements Runnable{

	private BufferedImage image;
	private Monster monster;
	private MapleFrame mapleFrame;
	
	
	
	public BackgroundMonsterService(Monster monster) {
		this.monster = monster;
		try {
			image = ImageIO.read(new File("images/map/backgroundmap.png"));
		} catch (IOException e) {
			System.out.println("이미지 경로를 찾을 수 없습니다.");
		}
	}

	@Override
	public void run() {
		while(true) {
			// 기준 왼쪽
			Color leftColor = new Color(image.getRGB(monster.getX(), monster.getY()));
			// 기준 오른쪾
			Color rightColor = new Color(image.getRGB(monster.getX(), monster.getY()));
			
			// 바닥 충돌 감지 기능
			int bottomColorLeft = image.getRGB(monster.getX(), monster.getY());
			int bottomColorRight = image.getRGB(monster.getX(), monster.getY());
			System.out.println("bottomColorLeft : " + bottomColorLeft);
			System.out.println("bottomColorRight :" + bottomColorRight);
			
			if(bottomColorLeft + bottomColorRight != -2) {
				// mapleFrame.setBgY(false);
			}
			
		}
		
	}
	
	
	
}
