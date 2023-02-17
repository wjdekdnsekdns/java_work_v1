package ch02;

public class LottonumTest {
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		int[] lottonum = test1.getLottoNumber();
		for(int i = 0; i <lottonum.length; i++) {
		System.out.print(lottonum[i] + "\t");
		}
	}
}
