package ch09;

import java.awt.BorderLayout;
import java.awt.Desktop.Action;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class lottoFrame extends JFrame {
	JButton button;
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
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("로또 버튼");
	}

	private void setInitLayout() {
		add(button, BorderLayout.NORTH);
		setVisible(true);
	}

	private void addEventListener() {

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("버튼 클릭 하세요", 200, 200);
		LottoRandomNumber lottoRandomNumber;
		lottoRandomNumber = new LottoRandomNumber();
		int[] getNumber = lottoRandomNumber.getLottoNumber();
		
		for (int i = 0; i < getNumber.length; i++) {
			int sum = 0;
			sum +=50;
			g.drawString(getNumber[i] + "", 50 + sum, 300);
		}
	}

}
