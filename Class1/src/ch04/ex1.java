package ch04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ex1 {
	public static void main(String[] args) {
		
		List list0;
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Student> members = new ArrayList<>();
		ArrayList<String> stings = new ArrayList<String>();
		
		list.add(3);
		list.add(null);
		list.add(100);
		list.add(1,20);
		System.out.println(list.toString());
		System.out.println(list.size());
		
		list.remove(2);
		System.out.println(list.toString());
		System.out.println(list.size());
		
		System.out.println("-----------------");
		System.out.println(list.get(2));
		System.out.println(list.get(0));
		System.out.println("-----------------");
		
		for(int 이름상관없음 : list) {
			System.out.println("변수명아무거나 됨 : " + 이름상관없음);
		}
		
		System.out.println(list.contains(70));
		System.out.println(list.contains(100));
		
		System.out.println(list.indexOf(100));
		System.out.println(list.indexOf(5000));
		
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println("값 확인 방법 : " + iter.next());
		}
	}
}
