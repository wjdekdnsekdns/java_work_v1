package ch07;
//MoveLableFrame2
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class MoveLableFrame2 extends JFrame implements Moveable {
	private JLabel label;
	private JLabel area;
	private final String ERRORMOVE = "화면 밖으로 이동불가";
	private int labelTextX;
	private int labelTextY;
	int maxSize;

	public MoveLableFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(800, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		label = new JLabel(new ImageIcon("image2.png"));
		label.setSize(100, 150);
		area = new JLabel("키보드 입력감지 텍스트");
		area.setSize(300, 50);
		setResizable(false); // 프레임 사이즈 조절 불가 설정
	}

	private void setInitLayout() {
		setLayout(null);
		label.setLocation(300, 350);
		labelTextX = 300;
		labelTextY = 350;
		area.setLocation(0, 0);
		add(area);
		add(label);
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					right();
				}
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					left();
				}
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					up();
				}
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					down();
					// Legacy Deprecated
					// labelText.move(labelText.getX(), labelText.getY()+MOVE);
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
	}

	@Override
	public void left() {
		if (labelTextX <= 0) {
			area.setText(ERRORMOVE);
			return;
		}
		int x = labelTextX -= 50;
		int y = labelTextY;
		label.setLocation(x, y);
		area.setText("왼쪽키 입력감지");
	}

	@Override
	public void right() {
		if (labelTextX >= getWidth() - label.getWidth()) {
			area.setText(ERRORMOVE);
			return;
		}
		int x = labelTextX += 50;
		int y = labelTextY;
		label.setLocation(x, y);
		area.setText("오른쪽키 입력감지");
	}

	@Override
	public void up() {
		if (labelTextY <= 0) {
			area.setText(ERRORMOVE);
			return;
		}
		int x = labelTextX;
		int y = labelTextY -= 50;
		label.setLocation(x, y);
		area.setText("위키 입력감지");
	}

	@Override
	public void down() {
		if (labelTextY >= getHeight() - label.getHeight()) {
			area.setText(ERRORMOVE);
			return;
		}
		int x = labelTextX;
		int y = labelTextY += 50;
		label.setLocation(x, y);
		area.setText("아래키 입력감지");
	}
	public static void main(String[] args) {
		new MoveLableFrame2();
	}
}
