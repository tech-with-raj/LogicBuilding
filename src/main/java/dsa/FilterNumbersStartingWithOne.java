package main.java.dsa;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/*
 * Problem Name: Filter Numbers Starting with Digit '1'
 *
 * Problem Statement:
 * Given a list of integers containing null values, filter out the null elements
 * and return only the numbers whose first digit is '1'.
 *
 * Example:
 *
 * Input:
 * [1, 23, 78, 124, null, 150]
 *
 * Output:
 * [1, 124, 150]
 *
 * Explanation:
 * - Remove null values from the list.
 * - Convert each number to a String.
 * - Check whether the String representation starts with '1'.
 * - Collect all matching numbers into a new list.
 *
 * Approach:
 * 1. Create a stream from the input list.
 * 2. Filter out null values using Objects::nonNull.
 * 3. Convert each number to its String representation.
 * 4. Check whether the String starts with the digit '1'.
 * 5. Collect the filtered numbers into a List.
 * 6. Print the resulting list.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Number of elements in the input list.
 */

public class FilterNumbersStartingWithOne {

    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(
                1,
                23,
                78,
                124,
                null,
                150
        );

        List<Integer> finalOutput = input.stream()

                // Remove null values
                .filter(Objects::nonNull)

                // Keep numbers starting with digit '1'
                .filter(number -> number.toString().startsWith("1"))

                .toList();

        System.out.println("Filtered Output : " + finalOutput);
    }
}