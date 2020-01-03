package xebia.assignment.palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * PalindromeTest
 * 
 * @author gopal211292@gmail.com
 *
 */
public class PalindromeTest {
	@Test
	public void testPalindrome() {
		Palindrome palindrome = new Palindrome();
		String output1 = palindrome.smallestPalindrome("palin");
		String output2 = palindrome.smallestPalindrome("a");
		String output3 = palindrome.smallestPalindrome("ab");
		String output4 = palindrome.smallestPalindrome("aba");

		// More input's and output's can be added to this call to test the method

		Assertions.assertEquals("palinilap", output1);
		Assertions.assertEquals("a", output2);
		Assertions.assertEquals("aba", output3);
		Assertions.assertEquals("aba", output4);
	}

}
