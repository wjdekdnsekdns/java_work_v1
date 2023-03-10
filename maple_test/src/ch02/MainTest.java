package ch02;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainTest extends JFrame {
	private JLabel background;
	private Monster monster;
	public MainTest() {
		// TODO Auto-generated constructor stub
	}

	private void initData() {
		setSize(1530,1530);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		background = new JLabel(new ImageIcon("images/맵1/20230223075307376_100020100.png"));
	}

	private void setInitLayout() {
		add(monster);
		setVisible(true);
	}

	private void addEventListener() {

	}
public static void main(String[] args) {
	
}
}
