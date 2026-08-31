package stringManipulation;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
			
		String str = "Testleaf";
		
		//String str = string.toLowerCase();
		
		// Solution provided by Bharath Udemy
		
		
		Map<Character, Integer>map = new HashMap<Character, Integer>();
		
//		int i = 0;
//		
//		while (i<str.length()) {
//			
//			char ch = str.charAt(i);
//			
//			if(map.containsKey(ch)) {
//				
//				map.put(ch, map.get(ch) + 1);
//			}
//			
//			else {
//				
//				map.put(ch, 1);
//			}
//			
//			i++;
//		}
//		 
		
		// Solution provided by ChatGPT
		
		for(char ch : str.toCharArray()) {   
			
			map.put(ch, map.getOrDefault(ch, 0) +1);
			
			
		}
//		
		System.out.println(map);
	}

}
