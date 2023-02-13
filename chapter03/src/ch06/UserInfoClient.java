package ch06;

import java.util.Scanner;

public class UserInfoClient {

	static String dbName = "Oracle";

	// main --> 실행하는 코드 작성(사용쪽 코드)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IUserInfoDao dao;
		IUserInfoDao[] dao1 = new IUserInfoDao[3];
		
		//UserInfoOracleDao 만들기
		// 스캐너 통해서 사용자 이름 사용자 비번 입력받기
		
		//흐름 만들기
		//1. 저장 기능 2. 수정 기능
		//dbName 변경해 가면서 코드 동작 확인하기
		System.out.println("아이디 비밀번호 입력 하시오");
		String inputUserName = sc.nextLine();
		String inputUserPw = sc.nextLine();
		UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);
		if (UserInfoClient.dbName.equals("Oracle")) {			
			dao1[0] = new UserInfoOracleDao();
		}

		// 저장 기능
		dao1[0].insertUserInfo(userInfo);
		
		
		//수정 기능
		
	}

}
