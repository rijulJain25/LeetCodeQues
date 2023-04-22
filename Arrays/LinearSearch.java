/*
QUESTION:
 Given an array, and an element num the task is to find if num is present in the given array or not. If present print the index of the element or print -1.

Examples:

Example 1:
Input: arr[]= 1 2 3 4 5, num = 3
Output: 2
Explanation: 3 is present in the 2nd index

Example 2:
Input: arr[]= 5 4 3 2 1, num = 5
Output: 0
Explanation: 5 is present in the 0th index
*/



package ArraysQues;

public class LinearSearch {
	
	public int singleNonDuplicate(int[] nums) {
		if( nums.length==1 ) return nums[0] ;
		for( int i=0;i<nums.length; ) {
			if( i<nums.length-1 && nums[i]==nums[i+1] )
				i +=2 ;
			else return nums[i] ;
		}   
		return 0 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
