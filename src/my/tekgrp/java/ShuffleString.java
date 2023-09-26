/**
 * 
 */
package my.tekgrp.java;

/**
 * You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character 
 * at the ith position moves to indices[i] in the shuffled string.
 * 
 * Return the shuffled string.
 * 
 * @author gk185062
 *
 */
public class ShuffleString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s = "codeleet";
		int indices[] = {4,5,6,7,0,2,1,3};
		
		System.out.println(restoreString(s, indices));
	}
	
	public static String restoreString(String s, int[] indices) {
		char res[] = new char[indices.length];
        int j = 0;
        for(int i : indices) {
        	res[i] = s.charAt(j);
        }
        
		return new String(res);
    }

}
