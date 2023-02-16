package ch06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChange2 extends JFrame implements ActionListener {
	private JPanel panel;
	private JPanel panel2;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	

	public ColorChange2() {
		initDAta();
		setInitLayout();
		addEventListener();
	}

	private void initDAta() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel2 = new JPanel();
		button1 = new JButton("click 1");
		button2 = new JButton("click 2");
		button3 = new JButton("click 3");
		button4 = new JButton("click 4");
		button5 = new JButton("click 5");
	}

	private void setInitLayout() {
		// Frame -> BorderLayout
		add(panel, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
	//	panel.setBackground(Color.yellow);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		setVisible(true);

	}

	private void addEventListener() {
		// this -> ColorChange -->ActionListener 타입으로 바라볼 수 있다
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
	}

	public static void main(String[] args) {
		new ColorChange2();
	}// end of main

	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		JButton targetButton = (JButton)e.getSource();
		
		// 문자열을 비교해서 색상을 변경 시키는 코드 작성
		if(targetButton.getText().equals(this.button1.getText())) {
			panel.setBackground(Color.red);
		}else if(targetButton.getText().equals(this.button2.getText())){
			panel.setBackground(Color.orange);
		}else if(targetButton.getText().equals(this.button3.getText())){
			panel.setBackground(Color.yellow);
		}else if(targetButton.getText().equals(this.button4.getText())){
			panel.setBackground(Color.green);
		}else{
			panel.setBackground(Color.blue);
		}
	}

}// emd of class
