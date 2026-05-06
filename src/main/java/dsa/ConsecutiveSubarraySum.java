package main.java.dsa;

/*
Problem Statement:
------------------
Given an integer array and a target sum,
find all consecutive subarrays whose sum is equal to the target value.

Example:
---------
Input:
arr = {7, 3, 1, 4, 5, 8, 2}
target = 10

Output:
Subarray Found : 7 3
Subarray Found : 1 4 5
Subarray Found : 8 2

Approach:
----------
1. Use Sliding Window Technique.
2. Expand the window by adding elements from the right.
3. If sum becomes greater than target, shrink window from the left.
4. When sum equals target, print the subarray.

Time Complexity  : O(n)
Space Complexity : O(1)
*/

public class ConsecutiveSubarraySum {

    public static void main(String[] args) {

        int[] arr = {7, 3, 1, 4, 5, 8, 2};
        int target = 10;

        findConsecutiveSubarrays(arr, target);
    }

    public static void findConsecutiveSubarrays(int[] arr, int target) {

        int left = 0;
        int sum = 0;
        boolean isFound = false;

        for (int right = 0; right < arr.length; right++) {

            // Add current element to window
            sum += arr[right];

            // Shrink window if sum exceeds target
            while (sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }

            // Check if target sum is found
            if (sum == target) {

                isFound = true;

                System.out.print("Subarray Found : ");

                for (int i = left; i <= right; i++) {
                    System.out.print(arr[i] + " ");
                }

                System.out.println();
            }
        }

        // If no matching subarray exists
        if (!isFound) {
            System.out.println("No Subarray Found");
        }
    }
}