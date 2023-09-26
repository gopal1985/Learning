/**
 * 
 */
package my.tekgrp.java;

/**
 * Given a sorted array of distinct integers and a target value, 
 * return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order. 
 * You must write an algorithm with O(log n) runtime complexity.
 *
 */
public class SearchInsertPosition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int nums[] = {1,3,5,6,8};
		int target = 9;

		System.out.println("The Index is :: " + searchInsert(nums, target));
	}
	
	 public static int searchInsert(int[] nums, int target) {

        int n = nums.length - 1;
		int start = 0;
		
		while (start <= n){
            int mid = (start + n)/2;
            
            if(target == nums[mid]) {
            	return mid;
            } else if(target > nums[mid]){
            	start = mid + 1;
            } else {
            	n = mid - 1;
            }
        }
		return start;
    }
}
