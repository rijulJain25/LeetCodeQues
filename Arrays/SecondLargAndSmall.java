/*
QUESTION:
Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

Examples:

Example 1:
Input: [1,2,4,7,7,5]
Output: Second Smallest : 2
	Second Largest : 5
Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

Example 2:
Input: [1]
Output: Second Smallest : -1
	Second Largest : -1
Explanation: Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.
*/



package ArraysQues;

import java.util.*;

public class SecondLargAndSmall {
	
	public static void SecLargAndSmall(int arr[], int n) {
		if(n == 1 || n == 0) {
			System.out.println("not Available");
			return;
		}
		
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;
		
		for(int i = 0; i<arr.length; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		
		for(int i = 0; i<arr.length; i++) {
			if(secMax<arr[i] && arr[i] != max) {
				secMax = arr[i];
			}
			if(secMin > arr[i] && arr[i] != min) {
				secMin = arr[i];
			}
		}
		
		System.out.println(secMax);
		System.out.println(secMin);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		SecLargAndSmall(arr, n);
		
		
	}

}
