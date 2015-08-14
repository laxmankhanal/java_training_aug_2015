/**
 * 
 */
package com.lftechnology.java.training.niraj.palindrome;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Get the largest palindrome got from product of two 3-digits number
 * 
 * @author Niraj Rajbhandari <nirajrajbhandari@lftechnology.com>
 *
 */
public class LargestPalindrome {

	private static final Logger LOGGER = Logger
			.getLogger(LargestPalindrome.class.getName());

	public static void main(String[] args) {
		int minLimit = 100;
		int maxLimit = 999;
		Palindrome palindromeHelper = new Palindrome(minLimit, maxLimit);
		int largestPalindrome = palindromeHelper.getLargestPalindrome();
		LOGGER.log(Level.INFO,
				"The largest palindrome for the product of two 3-digits number is "
						+ largestPalindrome);

	}

}
