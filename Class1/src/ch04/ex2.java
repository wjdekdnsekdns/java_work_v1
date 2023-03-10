package ch04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ex2 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		
		set1.add(1);
		set1.add(10);
		set1.add(100);
		set1.add(500);
		set1.add(1);
		set1.add(1);
		System.out.println(set1.toString());
		System.out.println(set1.size());
		
		set1.remove(500);
		set1.remove(1000);
		System.out.println(set1.toString());
		
		Iterator<Integer> iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		

	}
}
