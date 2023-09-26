/**
 * 
 */
package my.tekgrp.java;

/**
 * 
 */

/**
 * @author gk185062
 *
 */
public class IntegerToRoman {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 59;
		String roman = intToRomanOptimized(number);
		int num = romanToIntOptimized(roman);
		System.out.println(number); 
		System.out.println(roman);
		System.out.println(num);
	}
	
	//988
	
	public static String intToRoman(int num) {
		String number = String.valueOf(num);
		int len = number.length();
		String roman = "";
		for(int i=0;i<len;i++) {
			if(len-(i+1) == 3) {
				Integer temp = Integer.parseInt(String.valueOf(number.charAt(i)));
				int n = temp.intValue();
				if(n == 1) {roman=roman+"M";}
				if(n == 2) {roman=roman+"MM";}
				if(n == 3) {roman=roman+"MMM";}
			}else if(len-(i+1) == 2) {
				Integer temp = Integer.parseInt(String.valueOf(number.charAt(i)));
				int n = temp.intValue();
				if(n == 1) {roman=roman+"C";}
				if(n == 2) {roman=roman+"CC";}
				if(n == 3) {roman=roman+"CCC";}
				if(n == 4) {roman=roman+"CD";}
				if(n == 5) {roman=roman+"D";}
				if(n == 6) {roman=roman+"DC";}
				if(n == 7) {roman=roman+"DCC";}
				if(n == 8) {roman=roman+"DCCC";}
				if(n == 9) {roman=roman+"CM";}
			}else if(len-(i+1) == 1) {
				Integer temp = Integer.parseInt(String.valueOf(number.charAt(i)));
				int n = temp.intValue();
				if(n == 1) {roman=roman+"X";}
				if(n == 2) {roman=roman+"XX";}
				if(n == 3) {roman=roman+"XXX";}
				if(n == 4) {roman=roman+"XL";}
				if(n == 5) {roman=roman+"L";}
				if(n == 6) {roman=roman+"LX";}
				if(n == 7) {roman=roman+"LXX";}
				if(n == 8) {roman=roman+"LXXX";}
				if(n == 9) {roman=roman+"XC";}
			}else {
				Integer temp = Integer.parseInt(String.valueOf(number.charAt(i)));
				int n = temp.intValue();
				if(n == 1) {roman=roman+"I";}
				if(n == 2) {roman=roman+"II";}
				if(n == 3) {roman=roman+"III";}
				if(n == 4) {roman=roman+"IV";}
				if(n == 5) {roman=roman+"V";}
				if(n == 6) {roman=roman+"VI";}
				if(n == 7) {roman=roman+"VII";}
				if(n == 8) {roman=roman+"VIII";}
				if(n == 9) {roman=roman+"IX";}
			}
		}
				
		return roman;
        
    }
	
	public static String intToRomanOptimized(int num) {
	     
		int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        int i = 0;
    
        while (num > 0) {
            if (num >= values[i]) {
                
                sb.append(romanNumerals[i]);
                num -= values[i];
            } else {
                i++;
            }
        }

        return sb.toString();
    }
	
	
	
	public static int romanToInt(String s) {
	     
		int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int number = 0;
        int i = 0;
        
        while(s.length() > 0) {
        	if(s.substring(0,1).equals(romanNumerals[i])) {
        		number = number + values[i];
        		s = s.substring(1,s.length());
        	}else if(s.length() > 1 && s.substring(0,2).equals(romanNumerals[i])) {
        		number = number + values[i];
        		s = s.substring(2,s.length());
        	}else {
        		i++;
        	}
        }
        return number;
        
    }
	
	public static int romanToIntOptimized(String s) {
        
        int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) {
            	ans -= num;
            }else {
            	ans += num;
            }
        }
        return ans;
        
    }

}
