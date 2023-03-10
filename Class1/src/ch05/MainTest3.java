package ch05;

import java.util.HashMap;
import java.util.Map;

public class MainTest3 {

	public static void main(String[] args) {
		// Map 자료구조를 이용해서 전화번호를 저장해주세요
		// 1 - String, String
		// 2- String Object(person)
		Map map;
		Map<String, String> tel1 = new HashMap<>();
		
		tel1.put("아무개", "010-1234-5678");
		tel1.put("김무개", "010-4861-1634");
		tel1.put("아무개", "010-0251-1254");
		// key 값은 중복될 수 없다
		
		System.out.println(tel1.get("아무개"));
	}

}
