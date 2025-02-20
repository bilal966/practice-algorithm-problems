package com.xgeek.main;

/**
 * Java program to find the first missing positive number 
 *  using visited array
 *  https://leetcode.com/problems/first-missing-positive/
 */
public class FirstPositiveMissingNumber {

	public static void main(String[] args) {
		FirstPositiveMissingNumber obj =new FirstPositiveMissingNumber();
		 int[] arr = {3,4,-1,1};//{2, -3, 4, 1, 1, 7};//{7,8,9,11,12};
	        System.out.println(obj.firstMissingPositive(arr));
	}
	 public int firstMissingPositive(int[] a) {
	        int i = 0;
	        int n = a.length;
	        while (i < n) {
	            int correctIndex = a[i] - 1;
	            if (a[i] <= n && a[i] > 0 && a[i] != a[correctIndex]) {
	                // swap
	                swap(a, i, correctIndex);
	            } else {
	                i++;
	            }
	        }
	       
	        for (int j = 0; j < n; j++) {
	            if (a[j] != j + 1) {
	                return j + 1;
	            }
	        }
	        return n + 1; 
	        // if all elements from 1 to n are correctly positioned, 
	        // the first missing positive is n + 1
	    }

	    static void swap(int[] a, int i, int j) {
	        int temp = a[i];
	        a[i] = a[j];
	        a[j] = temp;
	    }
}
