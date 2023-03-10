package ch01;

import java.io.IOException;

public class systemInTest2 {

	public static void main(String[] args) {

		System.out.println("알파벳 여러개를 쓰고 엔터를 눌러 주세요");
		int i;
		try {
			// i = System.in.read(); // 한번 수행 되는 코드 --> 반복 --> 엔터기를 눌릴때 까지(\n)
			// (괄호 안에는 식을 작성할 수 있다)
			while ((i = System.in.read()) != '\n') {
				System.out.println(" i : " + i);
				System.out.println("인코딩 : " + (char) i);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}// end of main

}// end of class
