/**
 * 
 */
package my.tekgrp.java;

/**
 * @author gk185062
 * 
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 *
 */
public class LastWordLength {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "This is very good";
		
		System.out.println(str.trim().length() - str.trim().lastIndexOf(" ") - 1);

	}

}
