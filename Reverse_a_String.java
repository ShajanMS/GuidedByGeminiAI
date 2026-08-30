package stringManipulation;

public class Reverse_a_String {

	public static void main(String[] args) {
				
		String str = "Hello World";
		
		// Solution with For loop
		
//		String reverse = "";
//		
//		for (int i = str.length()-1; i >=0; i--) {
//			
//			reverse += str.charAt(i);
//			
//		}
//		
//		System.out.println(reverse);
//		
		
		StringBuilder SB = new StringBuilder(str);
		 
		SB.reverse();
		
		System.out.println(SB);
		
	
			
		}
	}

