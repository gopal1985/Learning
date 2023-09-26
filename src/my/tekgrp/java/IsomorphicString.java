/**
 * 
 */
package my.tekgrp.java;

import java.util.HashMap;

/**
 * @author gk185062
 *
 */
public class IsomorphicString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str1 = "egg";
		String str2 = "add";

		if(str1.length() != str2.length()) {
			System.out.println("FALSE");
		}
		
		HashMap map = new HashMap<String, String>();
		
		for (int i=0; i < str1.length(); i++) {
			if(!map.containsKey(i) && !map.containsValue(str2.charAt(i))) {
				map.put(str1.charAt(i), str2.charAt(i));
			} else if(map.containsValue(str2.charAt(i)) && map.get(i).equals(str2.charAt(i))) {
				continue;
			}
			System.out.println(map);
		}
		
		
		
	}

}
