package ch05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest1 {

	ServerSocket serverSocket;
	Socket socket;
	BufferedReader reader;
	BufferedWriter bufferedWriter;
	BufferedReader keyboardreader;
	
	public ServerTest1() {
		initData();
	}
	private void initData() {
		try {
			serverSocket = new ServerSocket(10000);
			socket = serverSocket.accept();
			System.out.println("클라이언트 연결 완료");
			
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			keyboardreader = new BufferedReader(new InputStreamReader(System.in));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			WriterThread writerThread = new WriterThread();
			Thread thread = new Thread(writerThread);
			thread.start();
			while(true) {
				String Msg = "클라이언트 >>> : " + reader.readLine() + "\n";
				System.out.println(Msg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	class WriterThread implements Runnable{

		@Override
		public void run() {
			while(true) {
				try {
					String serverMsg = "서버 : " + keyboardreader.readLine();
					System.out.println(serverMsg);
					
					bufferedWriter.write(serverMsg + "\n");
					bufferedWriter.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	public static void main(String[] args) {
		new ServerTest1();
	}
}
