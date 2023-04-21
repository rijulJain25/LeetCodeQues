/*
QUESTION:
Given an array, we have to find the largest element in the array.

Examples:

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 5
Explanation: 5 is the largest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 10
Explanation: 10 is the largest element in the array.
*/


package ArraysQues;

import java.util.*;


public class LargestEleArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		System.out.print(max);

	}

}
