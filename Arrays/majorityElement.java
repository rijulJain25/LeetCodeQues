/*
QUESTION:
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/



package ArraysQues;

import java.util.*;

public class majorityElement {
	
	public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> s = new HashMap<>();
        // int max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            if(s.containsKey(nums[i])){
                s.put(nums[i], s.get(nums[i])+1);
            }else{
                s.put(nums[i], 1);
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(s.get(nums[i]) > (nums.length/2)){
                return nums[i];
            }
        }
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
