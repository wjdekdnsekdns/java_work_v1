package Ex01;

import java.awt.BorderLayout;
import java.awt.Desktop.Action;
import java.awt.Graphics;
import java.awt.Paint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class lottoFrame extends JFrame {
	JButton button;
	
	boolean isStart = false;
	// 화면을 담당
	// LottoRandomNumber 클래스에 받아서 처리해 보자

	public lottoFrame() {
		// TODO Auto-generated constructor stub
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("로또 번호 만들기");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("로또 버튼");
		
	}

	private void setInitLayout() {
		add(button, BorderLayout.NORTH);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// 그림을 그릴때 두개 구분 : 처음, 버튼
		if (isStart == false) {
			g.drawString("버튼 클릭 하세요", 200, 200);
			return;
		}
		LottoRandomNumber lottoRandomNumber;
		lottoRandomNumber = new LottoRandomNumber();
		// 6개 정렬된 난수 받음
		int[] getNumbers = lottoRandomNumber.createNumber();
		g.drawString(getNumbers[0] + "", 50, 100);
		g.drawString(getNumbers[1] + "", 150, 100);
		g.drawString(getNumbers[2] + "", 250, 100);
		g.drawString(getNumbers[3] + "", 350, 100);
		g.drawString(getNumbers[4] + "", 450, 100);
		g.drawString(getNumbers[5] + "", 550, 100);
	}

	private void addEventListener() {
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				isStart = true;
				repaint();
				// 그림을 다시 그려라
			}
		});
	}

}
