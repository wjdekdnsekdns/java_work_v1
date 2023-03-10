package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStramTest2 {

	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("input.txt");
			byte[] bs = new byte[10];
			fis.read(bs);
			for (byte b : bs) {
				System.out.print((char)b);
			}

			System.out.println("\n>>> 기사 끝<<<");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없어요");
		} catch (IOException e) {
			System.out.println("입력 스트림 동작시 오류발생 했음");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}// end of main

}// end of class
