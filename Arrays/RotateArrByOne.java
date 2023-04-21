/*
QUESTION:
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 
 
 */


package ArraysQues;

public class RotateArrByOne {
	
	public static void inverting(int[] nums, int str, int end){
        while(str<end){
            int temp = nums[str];
            nums[str] = nums[end];
            nums[end] = temp;
            str++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return;
        }
        k = k%nums.length;
        inverting(nums, 0, nums.length-1);
        inverting(nums, 0, k-1);
        inverting(nums, k, nums.length-1);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
