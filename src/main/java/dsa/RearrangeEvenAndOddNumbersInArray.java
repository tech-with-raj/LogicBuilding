package main.java.dsa;

import java.util.Arrays;

/*
 * Problem Name: Rearrange Array with Even Numbers First and Odd Numbers Last
 *
 * Problem Statement:
 * Given an integer array:
 *
 * 1. Move all even numbers to the beginning of the array.
 * 2. Move all odd numbers to the end of the array.
 * 3. Sort the even and odd sections separately.
 *
 * The final array should contain:
 * - All even numbers in sorted order at the beginning.
 * - All odd numbers in sorted order at the end.
 *
 * Example:
 *
 * Input:
 * [2, 0, 6, 7, 3, 0, 1, 4, 6, 8, 9]
 *
 * Output:
 * [0, 0, 2, 4, 6, 6, 8, 1, 3, 7, 9]
 *
 * Explanation:
 * Step 1:
 * Partition the array so that all even numbers appear before odd numbers.
 *
 * Intermediate Example:
 * [2, 0, 6, 8, 4, 0, 6, 1, 3, 9, 7]
 *
 * Step 2:
 * Identify the boundary where even numbers end.
 *
 * Step 3:
 * Sort the even section separately:
 * [0, 0, 2, 4, 6, 6, 8]
 *
 * Step 4:
 * Sort the odd section separately:
 * [1, 3, 7, 9]
 *
 * Final Output:
 * [0, 0, 2, 4, 6, 6, 8, 1, 3, 7, 9]
 *
 * Approach:
 * 1. Initialize two pointers:
 *    - Left pointer from the beginning.
 *    - Right pointer from the end.
 * 2. Move the left pointer until an odd number is found.
 * 3. Move the right pointer until an even number is found.
 * 4. Swap both elements.
 * 5. Repeat until the pointers cross each other.
 * 6. Find the boundary separating even and odd elements.
 * 7. Sort the even section.
 * 8. Sort the odd section.
 * 9. Print the final rearranged array.
 *
 * Time Complexity: O(n + e log e + o log o)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Total number of elements.
 * e = Number of even elements.
 * o = Number of odd elements.
 */

public class RearrangeEvenAndOddNumbersInArray {

    public static void main(String[] args) {

        int[] input = {2, 0, 6, 7, 3, 0, 1, 4, 6, 8, 9};

        System.out.println("Original Array: " + Arrays.toString(input));

        int leftPointer = 0;
        int rightPointer = input.length - 1;

        // Step 1: Partition array into even and odd sections
        while (leftPointer < rightPointer) {

            while (leftPointer < rightPointer
                    && input[leftPointer] % 2 == 0) {

                leftPointer++;
            }

            while (leftPointer < rightPointer
                    && input[rightPointer] % 2 != 0) {

                rightPointer--;
            }

            if (leftPointer < rightPointer) {

                int temporaryValue = input[leftPointer];
                input[leftPointer] = input[rightPointer];
                input[rightPointer] = temporaryValue;

                leftPointer++;
                rightPointer--;
            }
        }

        // Step 2: Find end of even partition
        int evenPartitionEnd = 0;

        while (evenPartitionEnd < input.length
                && input[evenPartitionEnd] % 2 == 0) {

            evenPartitionEnd++;
        }

        // Step 3: Sort even and odd sections separately
        Arrays.sort(input, 0, evenPartitionEnd);
        Arrays.sort(input, evenPartitionEnd, input.length);

        System.out.println("Final Output:   " + Arrays.toString(input));
    }
}