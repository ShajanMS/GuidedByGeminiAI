package stringManipulation;

public class VowelCount {

	public static void main(String[] args) {

		int vowel = 0;

		int constonants = 0;

		String str = "Selenium3".toLowerCase();

		for (Character ch : str.toCharArray()) {

			if (Character.isLetter(ch)) {

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

					vowel++;

				}

				else {

					constonants++;

				}


			}
			
			else {
				
				System.out.println(ch + " is Ignonred");
			}
			
		}
		
		System.out.println("vowels : " + vowel);
		
		System.out.println("Constonants : " + constonants);
	}

}
