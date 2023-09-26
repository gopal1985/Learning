/**
 * 
 */
package my.tekgrp.java;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * You are given a string s, which contains stars *. 
 * In one operation, you can:
 * Choose a star in s.
 * Remove the closest non-star character to its left, as well as remove the star itself.
 * Return the string after all stars have been removed.
 * 
 * @author gk185062
 *
 */
public class RemoveStarsFromString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s = "abc**defg*h";
		
		//String s = "a*";
		
		System.out.println(s);
		
		System.out.println(removeStars(s));
	}
	
	
	public static String removeStars(String s) {
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i < s.length(); i++) {
			if(s.charAt(i) == '*') {
				//sb.deleteCharAt(sb.length()-1);
				sb.setLength(sb.length()-1);
			}else {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
    }
}
