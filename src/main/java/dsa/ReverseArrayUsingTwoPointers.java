package main.java.dsa;

import java.util.Arrays;

/*
 * Problem Name: Reverse an Array In-Place Using Two Pointers
 *
 * Problem Statement:
 * Given an integer array, reverse its elements without using any
 * additional array.
 *
 * The reversal should be performed in-place by swapping elements
 * from both ends of the array until the middle is reached.
 *
 * Example:
 *
 * Input:
 * [17, 38, 48, 90, 45, 65]
 *
 * Output:
 * [65, 45, 90, 48, 38, 17]
 *
 * Explanation:
 * Original Array:
 * [17, 38, 48, 90, 45, 65]
 *
 * Step 1:
 * Swap first and last elements:
 * [65, 38, 48, 90, 45, 17]
 *
 * Step 2:
 * Swap second and second-last elements:
 * [65, 45, 48, 90, 38, 17]
 *
 * Step 3:
 * Swap third and third-last elements:
 * [65, 45, 90, 48, 38, 17]
 *
 * The array is now fully reversed.
 *
 * Approach:
 * 1. Initialize two pointers:
 *    - Left pointer at the beginning of the array.
 *    - Right pointer at the end of the array.
 * 2. Swap the elements at the left and right pointers.
 * 3. Move the left pointer forward.
 * 4. Move the right pointer backward.
 * 5. Continue until both pointers meet or cross.
 * 6. Print the reversed array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Number of elements in the array.
 */

public class ReverseArrayUsingTwoPointers {

    public static void main(String[] args) {

        int[] inputArray = {17, 38, 48, 90, 45, 65};

        int leftPointer = 0;
        int rightPointer = inputArray.length - 1;

        int temporaryValue;

        while (rightPointer > leftPointer) {

            temporaryValue = inputArray[leftPointer];
            inputArray[leftPointer] = inputArray[rightPointer];
            inputArray[rightPointer] = temporaryValue;

            rightPointer--;
            leftPointer++;
        }

        System.out.println(Arrays.toString(inputArray));
    }
}