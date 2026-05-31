package main.java.dsa;

import java.util.Arrays;

/*
 * Problem Name: Move All Zeros to the End of an Array
 *
 * Problem Statement:
 * Given an integer array, move all zero elements to the end of the array
 * while maintaining the relative order of the non-zero elements.
 *
 * The operation must be performed in-place without using an additional array.
 *
 * Example:
 *
 * Input:
 * Array = [1, 0, 2, 3, 0, 5, 0, 9]
 *
 * Output:
 * [1, 2, 3, 5, 9, 0, 0, 0]
 *
 * Explanation:
 * All non-zero elements are moved toward the beginning of the array
 * while preserving their original order.
 *
 * Original:
 * [1, 0, 2, 3, 0, 5, 0, 9]
 *
 * After rearrangement:
 * [1, 2, 3, 5, 9, 0, 0, 0]
 *
 * Approach:
 * 1. Maintain a pointer to track the position where the next non-zero
 *    element should be placed.
 * 2. Traverse the array from left to right.
 * 3. Whenever a non-zero element is found:
 *    - Swap it with the element at the non-zero pointer.
 *    - Increment the non-zero pointer.
 * 4. Continue until the end of the array.
 * 5. Print the modified array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Number of elements in the array.
 */

public class MoveAllZerosToEnd {

    public static void main(String[] args) {

        int[] numbers = {1, 0, 2, 3, 0, 5, 0, 9};

        int nonZeroElementIndex = 0;
        int temporaryValue;

        for (int currentIndex = 0; currentIndex <= numbers.length - 1; currentIndex++) {

            if (numbers[currentIndex] != 0) {

                temporaryValue = numbers[nonZeroElementIndex];
                numbers[nonZeroElementIndex] = numbers[currentIndex];
                numbers[currentIndex] = temporaryValue;

                nonZeroElementIndex++;
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}