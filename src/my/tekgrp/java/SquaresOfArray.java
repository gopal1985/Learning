/**
 * 
 */
package my.tekgrp.java;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number 
 * sorted in non-decreasing order.
 * 
 * @author gk185062
 *
 */
public class SquaresOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
 
		int nums[] = {-7,-3,2,3,11};
		
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(sortedSquares(nums)));

	}
	
	public static int[] sortedSquares(int[] nums) {
		int result[] = new int[nums.length];
		int j = nums.length -1;
		int i = 0;
		int k = nums.length -1;
		while (i <= j) {
			if(nums[i]*nums[i] > nums[j]*nums[j]) {
				result[k] = nums[i]*nums[i];
				i++;
			} else {
				result[k] = nums[j]*nums[j];
				j--;
			}
			k--;
		}
		
        return result;
    }

}
