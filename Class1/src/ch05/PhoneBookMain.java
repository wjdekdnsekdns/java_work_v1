package ch05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookMain {
	public static void main(String[] args) {
		// while 0 종료 1 저장 2 전체조회 3 선택조회 4 선택삭제 5 전체 삭제
		// tip -> 데이터 입력
		// 셈플 데이터 만들어서 활용
		Scanner scanner = new Scanner(System.in);
		System.out.println(">>>기능을 선택해주세요<<<");
		String userInput;
		String userName;
		String userPhuneNumber;
		String serchName;
		String delName;
		Map<String, String> phoneBook = new HashMap<>();
		while (true) {
			System.out.println("0 종료, 1 저장, 2 전체조회, 3 선택조회, 4 선택삭제, 5 전체 삭제");
			userInput = scanner.nextLine();
			if (userInput.equals("1")) {
				System.out.println("이름을 입력 하세요");
				userName = scanner.nextLine();
				System.out.println("전화번호를 입력 하세요");
				userPhuneNumber = scanner.nextLine();
				phoneBook.put(userName, userPhuneNumber);
				System.out.println(userName + "님의 전화번호가 저장되었습니다");
			} else if (userInput.equals("2")) {
				for (String key : phoneBook.keySet()) {
					System.out.println("이름 : " + key);
					System.out.println("전화번호 : " + phoneBook.get(key));
				}
			} else if (userInput.equals("3")) {
				System.out.println("찾고싶은 사람의 이름을 입력 하세요");
				serchName = scanner.nextLine();
				for (String key : phoneBook.keySet()) {
					if (key.equals(serchName)) {
						System.out.println("이름 : " + key);
					System.out.println("전화번호 : " + phoneBook.get(key));
					}
				}
			} else if (userInput.equals("4")) {
				System.out.println("지우고싶은 사람의 이름을 입력하세요");
				delName = scanner.nextLine();
				phoneBook.remove(delName);
				System.out.println(delName + "님의 전화번호가 삭제되었습니다");
			} else if (userInput.equals("5")) {
				System.out.println("전체삭제 되었습니다");
				phoneBook.clear();
			} else if (userInput.equals("0")) {
				System.out.println("종료되없습니다");
				break;
			} else {
				System.out.println("잘못 입력함 다시 입력 해주세요");
			}
		}
	}
}
