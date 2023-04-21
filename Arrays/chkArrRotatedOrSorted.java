/*
QUESTION:
Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length], where % is the modulo operation.
*/


package ArraysQues;

public class chkArrRotatedOrSorted {
	
	public boolean check(int[] nums) {
        int rotateArr = 0;
		
		for(int i = 1; i< nums.length; i++) {
			if(nums[i]<nums[i-1]) {
                rotateArr++;
                if(rotateArr > 1){
                    return false;
                }
            }
		}
        if(rotateArr == 1){
            return nums[nums.length-1] <= nums[0];
        }
		return true;
    }
	
}
