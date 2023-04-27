/*
QUESTION:

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 
*/


package ArraysQues;

public class Sort0and1 {
	
	public void sortColors(int[] nums) {
        int str = 0; int next = 0; int end = nums.length-1;
        while(next<=end){
            if(nums[next] == 0){
                int temp = nums[next];
                nums[next] = nums[str];
                nums[str] = temp;
                next++;
                str++;
            }
            else if(nums[next] == 1){
                next++;
            }else{
                int temp = nums[next];
                nums[next] = nums[end];
                nums[end] = temp;
                end--;
            }
        }
    }

}
