package ch05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainTest4 {

	public static void main(String[] args) {
		// 기반 + 보조 스트림(자료형은 문자단위)
		FileReader fileReader = null;
		int count = 0;
		try {
			File file = new File("output2.txt");
			fileReader = new FileReader(file);
			// 한줄씩 글자를 읽어라
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			// 파일에다가 출력 하기
			FileWriter writer = new FileWriter("myText.txt");
//			writer.write(bufferedReader.read());
			writer.write(bufferedReader.readLine());
			writer.flush();// flush,close 를 해야한다
			//int i;
			//기반 스트림을 사용 (자료대상 - 문자열)
//			while ((i = fileReader.read()) != -1) {
//				System.out.println((char) i);
//				count++;
//			}
//			while((i = bufferedReader.read()) != -1) {
//				System.out.println((char)i);
//				count++;
//			}
			//bufferedReader.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("반복 횟수 : " + count);
	}// end of main

}// end of class
