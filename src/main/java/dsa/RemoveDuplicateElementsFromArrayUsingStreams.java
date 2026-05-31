package main.java.dsa;

import java.util.Arrays;

/*
 * Problem Name: Remove Duplicate Elements from an Array Using Stream API
 *
 * Problem Statement:
 * Given an integer array containing duplicate elements, remove all duplicates
 * using Java Stream API and return an array containing only distinct elements.
 *
 * The order of the first occurrence of each element should be preserved.
 *
 * Example:
 *
 * Input:
 * [1, 2, 2, 3, 3, 4, 5]
 *
 * Output:
 * [1, 2, 3, 4, 5]
 *
 * Explanation:
 * Duplicate elements:
 * - 2
 * - 3
 *
 * are removed using the distinct() method provided by the Stream API.
 *
 * The distinct() operation:
 * - Removes duplicate elements.
 * - Preserves encounter order for ordered streams.
 *
 * Approach:
 * 1. Print the original array.
 * 2. Convert the array into an IntStream using Arrays.stream().
 * 3. Apply the distinct() operation to remove duplicate elements.
 * 4. Convert the stream back into an integer array using toArray().
 * 5. Print the resulting array containing unique elements.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Number of elements in the input array.
 */

public class RemoveDuplicateElementsFromArrayUsingStreams {

    public static void main(String[] args) {

        int[] inputArray = {1, 2, 2, 3, 3, 4, 5};

        System.out.println(Arrays.toString(inputArray));

        inputArray = Arrays.stream(inputArray)
                .distinct()
                .toArray();

        System.out.println(Arrays.toString(inputArray));
    }
}