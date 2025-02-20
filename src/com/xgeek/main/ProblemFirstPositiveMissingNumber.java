package com.xgeek.main;

/**
 * Java program to find the first missing positive number 
 *  using visited array
 */
public class ProblemFirstPositiveMissingNumber {

	public static void main(String[] args) {
		 int[] arr = {2, -3, 4, 1, 1, 7};
	        System.out.println(missingNumber(arr));
	}
	static int missingNumber(int[] arr) {
        int n = arr.length;

        // To mark the occurrence of elements
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {

            // if element is in range from 1 to n
            // then mark it as visited
            if (arr[i] > 0 && arr[i] <= n)
                vis[arr[i] - 1] = true;
        }

        // Find the first element which is unvisited
        // in the original array
        for (int i = 1; i <= n; i++) {
            if (!vis[i - 1]) {
                return i;
            }
        }

        // if all elements from 1 to n are visited
        // then n+1 will be first positive missing number
        return n + 1;
    }

    

}
