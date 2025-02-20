package com.xgeek.main;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/find-the-duplicate-number/
 */
public class FindDuplicateNumber {

	public static void main(String[] args) {
		int[] A = {1,3,4,2,2};
		FindDuplicateNumber findDuplicateNumber = new FindDuplicateNumber();
        int solution = findDuplicateNumber.findDuplicate(A);
        System.out.println("Duplicate = " + solution);
        

	}
	
	public int findDuplicate(int[] nums) {
        int nums_length = nums.length;
        int duplicate = 0;
        int count=0;
        Map<Integer,Integer> result = new HashMap<>();
        for(int i=0;i<nums_length; i++){
            result.put(nums[i],result.getOrDefault(nums[i],0)+1);
        }
         for (Integer integer : result.keySet()) {
	            if (result.get(integer)>count) {
	                duplicate = integer;
                    count= result.get(integer);
	            }
	        }
        
        return duplicate;
    }
	/*
	 Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
Example 3:

Input: nums = [3,3,3,3,3]
Output: 3
	 
	 */

}
