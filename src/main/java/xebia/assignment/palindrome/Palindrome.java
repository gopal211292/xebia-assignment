package xebia.assignment.palindrome;

/**
 * Palindrome
 * 
 * @author gopal211292@gmail.com
 *
 */
public class Palindrome {
	/**
	 * Method that returns the smallest Palindrome String for a given String
	 * 
	 * @param str
	 * @return String
	 */
	public String smallestPalindrome(String str) {
		StringBuilder subStrNeeded = new StringBuilder();
		for (int i = 0, n = str.length() - 1; i < str.length(); i++, n--) {
			char startPointer = str.charAt(i);
			char endPointer = str.charAt(n);
			// If it has reached here that means String is already palindrome
			if (i == n) {
				return str;
			}
			// If the characters don't match then the substring in between them is needed to
			// get the shortest palindrome
			if (startPointer != endPointer) {
				subStrNeeded.append(str.substring(i, n));
				break;
			}
		}
		subStrNeeded.reverse();
		return str + subStrNeeded.toString();
	}

}
