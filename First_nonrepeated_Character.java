package stringManipulation;

import java.util.HashMap;
import java.util.Map;

public class First_nonrepeated_Character {

	public static void main(String[] args) {

		String str = "Swiss".toLowerCase();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : str.toCharArray()) {

			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		for (char ch : str.toCharArray()) {
			
			if(map.get(ch)==1) {
				
				System.out.println("The first Non Repeated character would be : " + ch);
				
			}
			
			
			break;
		}
		
	}

}
