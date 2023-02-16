package ch05;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	// 그림 위에다가 그림 올리기
	// JLable 이용하여 이미지 겹치기 활용
	private JLabel backfroundMap;
	private JLabel palyer;
	
	public MyFrame() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("이미지 겹치기 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Icon icon = new ImageIcon("images/background2.png");
		backfroundMap = new JLabel(icon);
		backfroundMap.setSize(500, 500);
		
		// null -> 좌표 --> 컴포넌트에 사이즈, 위치
		palyer = new JLabel(new ImageIcon("images/image3.png"));
		palyer.setSize(200, 200);
	}

	private void setInitLayout() {
		backfroundMap.setLocation(0, 0);
		palyer.setLocation(200, 200);
		add(palyer);
		add(backfroundMap);
		setLayout(null);
		setVisible(true);
	}
}
