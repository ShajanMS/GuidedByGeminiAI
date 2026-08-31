package stringManipulation;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
			
		String S1 = "silent";
		String S2 = "Pomogranate";
		
		char[] ch1 = S1.toCharArray();
		
		char[] ch2 = S2.toCharArray();
		
		if (ch1.length == ch2.length) {
			
			System.out.println("Both Character lengths are equal");
		}
		
		else {
			System.out.println("Both Character lengths are not equal");
		}
		Arrays.sort(ch1);
		
		Arrays.sort(ch2);
		
		if (Arrays.equals(ch1, ch2)) {
			
			System.out.println("True");
			
		}
	}

}
