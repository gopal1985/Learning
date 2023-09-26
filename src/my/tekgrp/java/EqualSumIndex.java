/**
 * 
 */
package my.tekgrp.java;

/**
 * @author gk185062
 *
 */
public class EqualSumIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer num[] = {1,8,3,1,4,1,5,2,7};
		
		int len = num.length;
		int i = 1;
		
		while (i < len) {
		
			int j = 0;
			int k = i+1;
			
			int leftSum = 0;
			int rightSum = 0;
			
			//Left Sum
			while (j < i) {
				leftSum = leftSum + num[j];
				j++;
			}
			
			//Right Sum
			while (k < len) {
				rightSum = rightSum + num[k];
				k++;
			}
			
			if(leftSum == rightSum) {
				System.out.println("The index is :: " + i);
				break;
			} else {
				i++;
			}
			
			if(i >= len) {
				System.out.println("No such index found");
			}
		}
	}
}
