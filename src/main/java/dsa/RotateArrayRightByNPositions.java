package main.java.dsa;

import java.util.Arrays;

/*
 * Problem Name: Rotate Array to the Right by N Positions
 *
 * Problem Statement:
 * Given an integer array and a number N, rotate the array to the right
 * by N positions.
 *
 * The rotation should be performed in-place using the Reversal Algorithm.
 *
 * Example:
 *
 * Input:
 * Array = [1, 2, 3, 4, 5, 6, 7]
 * N = 3
 *
 * Output:
 * [5, 6, 7, 1, 2, 3, 4]
 *
 * Explanation:
 * Original Array:
 * [1, 2, 3, 4, 5, 6, 7]
 *
 * Right Rotation by 3 Positions:
 *
 * Step 1: Reverse Entire Array
 * [7, 6, 5, 4, 3, 2, 1]
 *
 * Step 2: Reverse First K Elements
 * [5, 6, 7, 4, 3, 2, 1]
 *
 * Step 3: Reverse Remaining Elements
 * [5, 6, 7, 1, 2, 3, 4]
 *
 * Final Result:
 * [5, 6, 7, 1, 2, 3, 4]
 *
 * Approach:
 * 1. Calculate effective rotations using:
 *    k = N % arrayLength
 * 2. Reverse the entire array.
 * 3. Reverse the first k elements.
 * 4. Reverse the remaining elements.
 * 5. Print the array after each step for visualization.
 *
 * Reversal Algorithm:
 * - Reverse Complete Array
 * - Reverse First K Elements
 * - Reverse Remaining Elements
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Number of elements in the array.
 */

public class RotateArrayRightByNPositions {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        int rotations = 3;

        int effectiveRotations = rotations % numbers.length;

        // Step 1: Reverse the entire array
        reverse(numbers, 0, numbers.length - 1);

        System.out.println(Arrays.toString(numbers));

        // Step 2: Reverse first part (0 to k - 1)
        reverse(numbers, 0, effectiveRotations - 1);

        System.out.println(Arrays.toString(numbers));

        // Step 3: Reverse second part (k to end)
        reverse(numbers, effectiveRotations, numbers.length - 1);

        System.out.println(Arrays.toString(numbers));
    }

    private static void reverse(int[] numbers,
                                int leftPointer,
                                int rightPointer) {

        while (leftPointer < rightPointer) {

            int temporaryValue = numbers[leftPointer];

            numbers[leftPointer] = numbers[rightPointer];

            numbers[rightPointer] = temporaryValue;

            leftPointer++;
            rightPointer--;
        }
    }
}