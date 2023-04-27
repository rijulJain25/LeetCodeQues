/*
QUESTION:
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

*/


package ArraysQues;

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        int j = 0;
        int i = j+1;
        while(i<nums.length){
            if(nums[i]+nums[j] == target){
                arr[0] = j; 
                arr[1] = i;
                break;
            }else if(i == nums.length-1){
                j = j+1;
                i = j+1;
            }else{
                i++;
            }
        }
        return arr;
    }

}
