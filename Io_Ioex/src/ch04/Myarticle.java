package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Myarticle {

	public static void main(String[] args) {
		// 파일 입출력을 활용해서 
		// 입력 대상 : article1.txt
		// 출력대상 : today_article.txt
		
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("article1.txt");
			// 더이상 읽을게 없다면 -1을 리턴
			// Reader 기반은 2바이트 이상 처리 가능하다. -> 한글이 꺠지지 않는다
			fw = new FileWriter(" today_article.txt");
			fw.write("뉴스 이름 : MBC\n");
			int i;
			while((i = fr.read()) != -1) {
				
				fw.write(i);
			}
			fw.write("\n작성자 : 정다운");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				// 사전 기반 지식
				// Writer 를 작성할 때 스트림이 열려 있으면 잠시 버퍼 공간에 담아 두었다가
				// 스트림이 종료 되거나 flush 메서드를 만나면 실제로 file 에 출력한다
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
