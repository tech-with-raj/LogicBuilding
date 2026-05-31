package main.java.dsa;

import java.util.HashSet;
import java.util.Set;

/*
 * Problem Name: Find Unique Element in an Array Using HashSet
 *
 * Problem Statement:
 * Given an integer array where some elements may appear more than once,
 * find the element(s) that occur exactly once.
 *
 * The program uses two HashSets:
 * - One to track all seen elements.
 * - Another to track duplicate elements.
 *
 * After identifying duplicates, all duplicate elements are removed
 * from the seen set, leaving only unique elements.
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
 * Since only 3 appears exactly once, it is the unique element.
 *
 * Approach:
 * 1. Create a HashSet to store seen elements.
 * 2. Create another HashSet to store duplicate elements.
 * 3. Traverse the array.
 * 4. Add each element to the seen set.
 * 5. If add() returns false, the element already exists and is a duplicate.
 * 6. Store duplicate elements in the duplicate set.
 * 7. Remove all duplicates from the seen set.
 * 8. The remaining element(s) in the seen set are unique.
 * 9. Print the unique element.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Number of elements in the array.
 */

public class FindUniqueElementInArray {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 1, 2};

        Set<Integer> seenElements = new HashSet<>();
        Set<Integer> duplicateElements = new HashSet<>();

        for (int number : numbers) {

            // If add() returns false, the element already exists
            if (!seenElements.add(number)) {

                duplicateElements.add(number);
            }
        }

        // Remove duplicate elements and keep only unique elements
        seenElements.removeAll(duplicateElements);

        System.out.println("Unique Elements: " + seenElements.iterator().next());
    }
}