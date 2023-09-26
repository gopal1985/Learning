/**
 * 
 */
package my.tekgrp.java;

import java.util.Arrays;

/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * 
 * @author gk185062
 *
 */
public class RotateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int nums[] = {1,2,3,4,5,6,7};
		int k = 3;
		
		rotate(nums, k);
	}
	
	public static void rotate(int[] nums, int k) {
		
		int res[] = new int[nums.length];
		
		int j = k-1;
		int l = k;
		
		for(int i=0; i<nums.length;i++) {
			if(i < nums.length-k) {
				res[l] = nums[i];
				l++;
			}else {
				res[j] = nums[i];
				j--;
			}
		}
        
		System.out.println(Arrays.toString(res));
		
    }
	
	public static void rotateV2(int[] nums, int k) {
		
		int i = k-1;
		int j = k;
		
		while(i < j) {
			
		}
        
		System.out.println(Arrays.toString(nums));
		
    }

}
