package main.java.dsa;

/*
 * Problem Name: Find Unique Elements in an Array Using Nested Loops
 *
 * Problem Statement:
 * Given an integer array, find and print all elements that appear
 * exactly once in the array.
 *
 * An element is considered unique if its frequency is equal to one.
 *
 * Example:
 *
 * Input:
 * Array = [1, 2, 3, 1, 2]
 *
 * Output:
 * Unique Elements: 3
 *
 * Explanation:
 * Frequency of elements:
 *
 * 1 → 2 times
 * 2 → 2 times
 * 3 → 1 time
 *
 * Since 3 appears only once, it is the unique element.
 *
 * Approach:
 * 1. Traverse the array using an outer loop.
 * 2. For each element, use an inner loop to count its occurrences.
 * 3. Compare the current element with every element in the array.
 * 4. Increment the count whenever a match is found.
 * 5. If the count equals 1, print the element as a unique element.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Number of elements in the array.
 */

public class FindUniqueElementsUsingNestedLoops {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 1, 2};

        for (int i = 0; i < numbers.length; i++) {

            int count = 0;

            for (int j = 0; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {

                    count++;
                }
            }

            if (count == 1) {

                System.out.println("Unique Elements: " + numbers[i]);
            }
        }
    }
}