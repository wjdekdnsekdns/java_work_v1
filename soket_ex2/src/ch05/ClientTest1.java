package ch05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest1 {

	Socket socket;
	final String IP = "192.168.0.89";
	final int PORT = 10000;
	BufferedReader keyboradReader;
	BufferedWriter writer;
	BufferedReader socketreader;

	public ClientTest1() {
	initData();
	}
	

	private void initData() {
		System.out.println("클라이언트에서 서버 접속 요청");
		try {
			socket = new Socket(IP, 10000);

			keyboradReader = new BufferedReader(new InputStreamReader(System.in));
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			socketreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			new Thread(new ReadThread()).start();
			while (true) {
				System.out.println("키보드 입력 대기");
				String input = keyboradReader.readLine();
				writer.write(input);
				writer.newLine();
				writer.flush();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				keyboradReader.close();
				writer.close();
				socketreader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	class ReadThread implements Runnable {

		@Override
		public void run() {
			while (true) {
				try {
					String serverMsg = socketreader.readLine();
					System.out.println("서버 >>> : " + serverMsg);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		new ClientTest1();
	}
}
