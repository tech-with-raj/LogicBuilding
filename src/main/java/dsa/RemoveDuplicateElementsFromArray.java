package main.java.dsa;

import java.util.Arrays;
import java.util.LinkedHashSet;

/*
 * Problem Name: Remove Duplicate Elements from an Array
 *
 * Problem Statement:
 * Given an integer array containing duplicate elements, remove all duplicates
 * while preserving the insertion order of the elements.
 *
 * After removing duplicates:
 * 1. Display the unique elements as a Set.
 * 2. Convert the Set back into an integer array.
 * 3. Display the resulting array.
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
 * Duplicate occurrences of:
 * - 2
 * - 3
 *
 * are removed.
 *
 * LinkedHashSet is used because:
 * - It stores only unique elements.
 * - It preserves insertion order.
 *
 * Approach:
 * 1. Create a LinkedHashSet to store unique elements.
 * 2. Traverse the input array.
 * 3. Add each element to the LinkedHashSet.
 * 4. Duplicate elements are automatically ignored.
 * 5. Print the LinkedHashSet.
 * 6. Convert the LinkedHashSet into an integer array using Stream API.
 * 7. Print the resulting array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Number of elements in the input array.
 */

public class RemoveDuplicateElementsFromArray {

    public static void main(String[] args) {

        int[] inputArray = {1, 2, 2, 3, 3, 4, 5};

        LinkedHashSet<Integer> uniqueElements = new LinkedHashSet<>();

        for (int element : inputArray) {

            uniqueElements.add(element);
        }

        System.out.println(uniqueElements);

        // Convert Set to Array
        int[] resultArray = uniqueElements.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(resultArray));
    }
}