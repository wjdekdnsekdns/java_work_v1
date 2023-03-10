package ch04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest {

	// 통신을 하기 위해 소켓이 필요 + 주소(IP) + 포트번호
	Socket socket;
	// final String IP = "localhost";
	final String IP = "192.168.0.89";
	final int PORT = 10000;
	BufferedReader keyboradReader;
	BufferedWriter writer;

	// 소켓 통신으로 통해 들어온 데이터를 입력 받아야함
	// 입력 스트림 필요함
	BufferedReader socketreader;

	public ClientTest() {
		initData();
	}

	private void initData() {
		System.out.println("클라이언트에서 서버 접속 요청");
		try {
			socket = new Socket(IP, 10000);
			// 클라이언트와 서버 연결 완료

			// 키보드에서 데이터 입력
			keyboradReader = new BufferedReader(new InputStreamReader(System.in));

			// 소켓통신을 통해서 데이터를 출력
			// 출력 스트림 연결 : 대상 소켓
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// 소켓과 입력 스트림 연결하기(초기화)
			// 입력 스트림 연결 완료
			socketreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//서버 측으로 온 데이터 확인 (입력 스트림)
			new Thread(new ReadThread()).start();
			
			while (true) {
				System.out.println("키보드 입력 대기");
				String input = keyboradReader.readLine(); // 키보드에서 데이터 입력 받음
				writer.write(input);
				writer.newLine();// 문자에 끝을 알려 주어야 한다
				writer.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				keyboradReader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}// end of initData
		// 내부 클래스

	class ReadThread implements Runnable {

		@Override
		public void run() {
			// 소켓통신으로 들어온 데이터를 읽어야 해
			while (true) {
				try {
					String serverMsg = socketreader.readLine();
					System.out.println("서버로부터 온 메세지 : " + serverMsg);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		new ClientTest();
	}
}
