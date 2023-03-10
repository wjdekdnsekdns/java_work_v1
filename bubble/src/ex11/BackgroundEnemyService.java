package ex11;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//  메인 쓰레드는 화면에 그림 그려주고있고 (키보드 이벤트 리스너 받고 있음)
// 백그라운드에서 계속 Player 에 움직임을 관찰
public class BackgroundEnemyService implements Runnable {

	private BufferedImage image;
	private Enemy enemy;

	private int JUMPCOUNT = 0;
	private int FIRST = 0;// 바닥 도착 여부 0, 꼭대기면 1
	private int BOTTOMCOLOR = -1;

	public BackgroundEnemyService(Enemy enemy) {
		this.enemy = enemy;

		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("백그라운드플레이어서비스 객체에 사용하는 이미지 경로 및 파일명 확인!");
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		while (enemy.getState() == 0) {
			// 색상 확인
			// 왼쪽으로 갈 때는 좌표 지점을 보정해야 하고
			// 오른쪽으로 갈 떄는 역시나 기준 좌표 지점을 보정해야 한다
			// 기준 왼쪽 // 기준 오른쪽

			Color leftColor = new Color(image.getRGB(enemy.getX() + 10, enemy.getY() + 25));
			Color rightColor = new Color(image.getRGB(enemy.getX() + 65, enemy.getY() + 25));

			// 바닥 충돌 감지
			// Color bottomColorLeft = new Color(image.getRGB(player.getX() + 10,
			int bottomColorLeft = image.getRGB(enemy.getX() + 15, enemy.getY() + 55);
			int bottomColorrRight = image.getRGB(enemy.getX() + 60, enemy.getY() + 55);
			System.out.println("bottomColorLeft" + bottomColorLeft);
			System.out.println("bottomColorLeft" + bottomColorrRight);
			// -1, -1 == 공중
			if (bottomColorLeft + bottomColorrRight != -2) {
				enemy.setDown(false);
			} else {

			}

			// 외벽 충돌 하기
			// 꼭대기 도착
			// if()

			// 오른쪽 구석

			// 왼쪽 구석
		} // end of while

	}// end of run

}
