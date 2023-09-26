/**
 * 
 */
package my.tekgrp.java;

/**
 * @author gk185062
 *
 */
public class EqualSumIndexV2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer num[] = {-1,1,2};
		
		int len = num.length;
		int sum = 0;
		int leftSum = 0;
		
		for(int i=0; i<len; i++) {
			sum = sum + num[i];
		}

		System.out.println("SUM :: " + sum);
		for(int i=0; i<len; i++ ) {
			if(i!=0) {
				leftSum = leftSum + num[i-1];
			}
			int chksum = sum - num[i] - (leftSum * 2);
			if(chksum == 0) {
				System.out.println("The index is :: " + (i));
				break;
			}
			
			if(i >= len-1) {
				System.out.println("No Index found");
				break;
			}
		}
		
	}
}
