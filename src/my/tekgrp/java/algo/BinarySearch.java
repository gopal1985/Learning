/**
 * 
 */
package my.tekgrp.java.algo;

/**
 * @author gk185062
 *
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int nums[] = {1,3,5,7,9,11}; 
		int target = 12;
		System.out.println(searchV2(nums, target));
	}
	
	
	public static int searchV2(int[] nums, int target) {
		
		int i=0;
		int n = nums.length - 1;
		
		while (i <= n ) {
			int mid = i + (n-i)/2;
			
			if(nums[mid] > target){
				n = mid - 1;
            } else if(nums[mid] < target){
            	i = mid + 1;
            } else {
            	return mid;
            }
		}
        return -1;
    }
	

	public static int search(int[] nums, int target) {
		
        for (int i=0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

}
