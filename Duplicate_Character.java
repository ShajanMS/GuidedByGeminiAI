package stringManipulation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate_Character {

	public static void main(String[] args) {

		String str = "success";

//		ArrayList<Character> list = new ArrayList<Character>();
//
//		for (int i = 1; i < str.length(); i++) {
//
//			char echa = str.charAt(i);
//
//			if (!list.contains(echa)) {
//
//				list.add(echa);
//			}
//
//		}
//
//		StringBuilder sb = new StringBuilder();
//
//		for (char ch : list) {
//
//			sb.append(ch);
//
//		}
//
//		System.out.println(sb);
//
//	}

		
		Set<Character> set = new LinkedHashSet<Character>();
		
		for (Character ch : str.toCharArray()) {
			
			set.add(ch);
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (Character ch : set) {
			
			sb.append(ch);
		}
		
		System.out.println(sb);
}
	
}

