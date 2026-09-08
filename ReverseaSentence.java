package stringManipulation;

public class ReverseaSentence {

	public static void main(String[] args) {
			
		String str = "Java Selenium Test";
		
		String[] words = str.split("\\s+");
		
		StringBuilder reverse = new StringBuilder();
		
		for (int i = words.length-1; i >=0 ; i--) {
			
			reverse.append(words[i]);
			
			if(i>0) {
				
				reverse.append(" ");
			}
		}
		
		System.out.println(reverse.toString());
	}

}
