/*
QUESTION:
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
*/


package ArraysQues;

import java.util.*;

public class IntersectionOfArr {
	
	public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            set2.add(i);
        }
        //Removed Duplicates using Hashset
        Set<Integer> Main_Set = new HashSet<>();
        for (Integer var : set1) {
            if (set2.contains(var)) {
                Main_Set.add(var);
            }
        }
        int[] arr = new int[Main_Set.size()];
        int j = 0;
        for (Integer val : Main_Set) {
            arr[j] = val.intValue();
            j++;
        }
        return arr;
	}

}
