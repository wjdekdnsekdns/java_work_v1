package ex08;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.plaf.metal.MetalBorders.PaletteBorder;

//  메인 쓰레드는 화면에 그림 그려주고있고 (키보드 이벤트 리스너 받고 있음)
// 백그라운드에서 계속 Player 에 움직임을 관찰
public class BackgroundPlayerService implements Runnable {

	private BufferedImage image;
	private Player player;

	public BackgroundPlayerService(Player player) {
		this.player = player;

		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("백그라운드플레이어서비스 객체에 사용하는 이미지 경로 및 파일명 확인!");
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		while (true) {
			// 색상 확인
			// 왼쪽으로 갈 때는 좌표 지점을 보정해야 하고
			// 오른쪽으로 갈 떄는 역시나 기준 좌표 지점을 보정해야 한다
			// 기준 왼쪽 // 기준 오른쪽

			Color leftColor = new Color(image.getRGB(player.getX() + 10, player.getY() + 25));
			Color rightColor = new Color(image.getRGB(player.getX() + 65, player.getY() + 25));
			Color topColor = new Color(image.getRGB(player.getX()+20, player.getY()-20));

			// 바닥 충돌 감지
			// Color bottomColorLeft = new Color(image.getRGB(player.getX() + 10,
			// player.getY()+60));
			// -65536, -16776961, -1
			int bottomColorLeft = image.getRGB(player.getX() + 15, player.getY() + 55);
			// -65536, -1677696, -1
			int bottomColorrRight = image.getRGB(player.getX() + 60, player.getY() + 55);
			// 하얀색이 아니면 바닥이다
			if (bottomColorLeft + bottomColorrRight != -2) {
				// System.out.println("여기는 바닥입니다");
				player.setDown(false);
			} else {
				// 조금 점프 하는 순간 bottomColorLeft -> -1 이된다
				// 위 화살표를 누르면 현재 65번 반복 돌면서 y 값 마이너스 해서
				// 이미지를 위로 올리고있고 현재 y 좌표에서 +130 좌표 올리고 --> down() 메서드 호출
				// 올라 동시에 위+ 위 +위
				if (player.isUp() == false && player.isDown() == false) {
					// 다운 메서드가 한번 호출 되어야 한다.
					player.down();
				}
			}
			if(topColor.getRed() == 255 && topColor.getGreen() == 0 && topColor.getBlue() == 0) {
				player.setUp(false);
				player.setTopWallCrush(true);
			}else {
				player.setTopWallCrush(false);
			}
			if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
				player.setRight(false);
				// 벽에 충돌 했다 <---
				player.setRightWallCrash(true);
			} else if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				player.setLeft(false);
				player.setLeftWallCrash(true);
			} else {
				player.setLeftWallCrash(false);
				player.setRightWallCrash(false);
			}
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
