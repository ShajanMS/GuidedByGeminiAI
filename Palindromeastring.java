package stringManipulation;

public class Palindromeastring {

	public static void main(String[] args) {
			
		String str = "Radar";
		
		String lower = str.toLowerCase();
		
		// Solution with For loop
		
//		String reverse = "";
//		
//		for (int i = lower.length()-1; i>=0 ; i--) {
//			
//			reverse += lower.charAt(i);
//			
//		}
//			
//		System.out.println(reverse);
		
		
		StringBuilder sb = new StringBuilder(lower).reverse();
		
		System.out.println(sb);
		
		if (lower.equals(sb.toString()) ) {
			
			System.out.println("True");		
		} else {
			
			System.out.println("False");
		}	
		
	}

}
