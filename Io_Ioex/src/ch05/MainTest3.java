package ch05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest3 {

	public static void main(String[] args) {
		long millisecond = 0;

		// 1
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("bubble.zip");
			fos = new FileOutputStream("bubblecopy.zip");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			int i;
			millisecond = System.currentTimeMillis(); 
			while ((i = bis.read()) != -1) {
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("파일 복사 시 소요 시간 : " + millisecond);
	}// end of main

}// end of class
