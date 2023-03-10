package ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStram3 {

	public static void main(String[] args) {
		// output3.txt
		// hellow world 출력
		FileOutputStream fos = null;
		FileInputStream fis = null;
		// 파일이 없다면 FIleOut... 파일을 먼저 생성해 준다
		try {
			fos = new FileOutputStream("output3.txt");
			
			int i;
			fos.write(104);
			fos.write(101);
			fos.write(108);
			fos.write(108);
			fos.write(111);
			fos.write(119);
			fos.write(32);
			fos.write(119);
			fos.write(111);
			fos.write(114);
			fos.write(108);
			fos.write(100);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// end of main

}// end of class
