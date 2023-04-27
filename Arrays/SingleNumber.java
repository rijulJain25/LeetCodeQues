/*
QUESTION:
Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.

Examples:

Example 1:
Input Format: arr[] = {2,2,1}
Result: 1
Explanation: In this array, only the element 1 appear once and so it is the answer.

Example 2:
Input Format: arr[] = {4,1,2,1,2}
Result: 4
Explanation: In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.
*/


package ArraysQues;

import java.util.*;

public class SingleNumber {
	
	public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int num;
        for(int i = 0; i<nums.length-1; i+=2){
            if(nums[i] != nums[i+1]){
                num = nums[i];
                return num;
            }
        }
        return nums[nums.length-1];
    }

}
