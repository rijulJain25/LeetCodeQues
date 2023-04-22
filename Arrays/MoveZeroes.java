/*
 QUESTION:
 Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 */

package ArraysQues;

public class MoveZeroes {
	
	public void moveZeroes(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int j = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] != 0){
                arr[j] = nums[i];
                j++;
            }
        }
        for(int i = 0; i<n; i++){
            if(nums[i] == 0){
                arr[j] = nums[i];
                j++;
            }
        }

        for(int i = 0; i<n; i++){
            nums[i] = arr[i];
        }

        
    }
}
