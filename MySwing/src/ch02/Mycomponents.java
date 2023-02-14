package ch02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Mycomponents extends JFrame{
	private JButton button1;
	private JLabel lable; //글자를 넣어서 화면에 띄울수 있다
	private JTextField textFiled; // 사용자 한테 입력 값을 받을 수 있는 컴포넌트
	private JPasswordField jPasswordField;// 사용자 비번을 받는 컴포넌트
	private JCheckBox checkBox;// 
	public Mycomponents() {
		initData();
		setInitLayout();
	}
	public void initData() {
		setTitle("컴포넌트 확인");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("JButton");
		lable = new JLabel("글자를 적는 컴포넌트");
		textFiled = new JTextField("아이디 입력", 20);
		jPasswordField = new JPasswordField("비번입력", 10 );
		checkBox = new JCheckBox("동의");
		
		
	}
	public void setInitLayout() {
		add(button1);
		add(lable);
		add(jPasswordField);
		add(checkBox);
		setLayout(new FlowLayout());
		setVisible(true);
	}
	public static void main(String[] args) {
		new Mycomponents();
	}
}
