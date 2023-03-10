package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStram1 {

	public static void main(String[] args) {
		// 현재 output.txt 파일은 없는 상태(맨 처음)
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("output.txt");
			fos.write(97);
			fos.write(98);
			fos.write(99);
			fos.write(100);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}// end of main

}// end of class
