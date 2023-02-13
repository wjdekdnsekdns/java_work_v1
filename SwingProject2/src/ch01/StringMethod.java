package ch01;

public class StringMethod {

	public static void main(String[] args) {
		        // 1.
				// startsWith1 : 문자열이 지정한 문자로 시작하는지 판단 같으면 true반환 아니면 false를 반환한다.(대소문자구별)
				String str1 = "apple";
				boolean startsWith1 = str1.startsWith("a");
				boolean startsWith2 = str1.startsWith("b");
				System.out.println("startsWith : " + startsWith1);// startsWith : true
				System.out.println("startsWith : " + startsWith2);// startsWith : false
				
				System.out.println("------------------------");
				
				// 2.
				// endWith1 : 문자열 마지막에 지정한 문자가 있는지를 판단후 있으면 true, 없으면 false를 반환한다.(대소문자구별)
				String str2 = "test";
				boolean endWith1 = str2.endsWith("t");
				boolean endWith2 = str2.endsWith("T");
				System.out.println("endWith : " + endWith1);// endWith : true
				System.out.println("endWith : " + endWith2);// endWith : false
				
				System.out.println("------------------------");
				
				// 3.
				// indexOf:지정한 문자가 문자열에 몇번째에 있는지를 반환한다.
				String str3 = "abcdef";
				int indexOf = str3.indexOf("c");
				System.out.println("indexOf : " + indexOf);// indexOf : 2
	}

}
