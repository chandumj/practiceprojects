package assistedPractices;

public class UtilClass {
	// palindrome => pop, mom, lol , tot
	
		// inputText = posfferttx
		
		public static boolean isPalindrome(String inputText)
		{
			int i = inputText.length()-1; // 9
			int j = 0;  // 0
			
			while(i > j) {
				
				if(inputText.charAt(i) != inputText.charAt(j))
				{
					return false;
				}
				
				i--;
				j++;
			}
			
			return true;
		}

}
