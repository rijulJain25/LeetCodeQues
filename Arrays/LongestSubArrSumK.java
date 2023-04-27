/*
QUESTION:
Given an array and a sum k, we need to print the length of the longest subarray that sums to k.

Examples:

Example 1:
Input Format: N = 3, k = 5, array[] = {2,3,5}
Result: 2
Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

Example 2:
Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
Result: 3
Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.
*/



package ArraysQues;

import java.util.Scanner;

public class LongestSubArrSumK {
	
	public static int LongestSubArrSumEqlToK(int[] arr, int n, int k) {
		int str = 0; int end = -1; int sum = 0; int maxLength = 0;
		while(str<n) {
			while((end+1 < n) && (sum + arr[end+1] <= k)) {
				sum += arr[++end];
			}
			if(sum == k) {
				maxLength = Math.max(maxLength, end-str+1);
			}
			
			sum -= arr[str];
			str++;
		}
		return maxLength;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		int k = s.nextInt();
		System.out.println(LongestSubArrSumEqlToK(arr, n, k));
	}
}
