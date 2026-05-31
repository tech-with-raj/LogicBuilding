package main.java.dsa;

import java.util.Arrays;

/*
 * Problem Name: Reverse an Array Using an Auxiliary Array
 *
 * Problem Statement:
 * Given an integer array, create a new array that contains the elements
 * of the original array in reverse order.
 *
 * The original array should remain unchanged, and the reversed elements
 * should be stored in a separate array.
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
 * Reversed Array:
 * [65, 45, 90, 48, 38, 17]
 *
 * The program traverses the original array from the last element
 * to the first element and copies the values into a new array.
 *
 * Approach:
 * 1. Create a new array with the same size as the input array.
 * 2. Initialize an index for the new array.
 * 3. Traverse the original array from the last index to the first.
 * 4. Copy each element into the new array sequentially.
 * 5. Increment the new array index after each insertion.
 * 6. Print the reversed array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Number of elements in the array.
 */

public class ReverseArrayUsingAuxiliaryArray {

    public static void main(String[] args) {

        int[] inputArray = {17, 38, 48, 90, 45, 65};

        int[] reversedArray = new int[inputArray.length];

        int reversedArrayIndex = 0;

        for (int index = inputArray.length - 1; index >= 0; index--) {

            reversedArray[reversedArrayIndex] = inputArray[index];
            reversedArrayIndex++;
        }

        System.out.println(Arrays.toString(reversedArray));
    }
}