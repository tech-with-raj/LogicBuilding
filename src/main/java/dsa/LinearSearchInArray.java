package main.java.dsa;

/*
 * Problem Name: Linear Search in an Array
 *
 * Problem Statement:
 * Given an array of integers and a target element (key),
 * find whether the target element exists in the array.
 *
 * If the element is found, print its index position.
 * Otherwise, display a message indicating that the element
 * is not present in the array.
 *
 * Linear Search works by checking each element sequentially
 * until the target element is found or the array ends.
 *
 * Example:
 *
 * Input:
 * Array = [10, 3, 56, 45, 50]
 * Key = 3
 *
 * Output:
 * Element found at index 1
 *
 * Explanation:
 * The algorithm starts from index 0 and compares each element
 * with the target value.
 *
 * Index 0 → 10 ≠ 3
 * Index 1 → 3 = 3
 *
 * Therefore, the element is found at index 1.
 *
 * Approach:
 * 1. Initialize a boolean flag to track whether the element is found.
 * 2. Traverse the array from the first element to the last.
 * 3. Compare each element with the target key.
 * 4. If a match is found:
 *    - Print the index.
 *    - Mark the flag as true.
 *    - Exit the loop.
 * 5. After traversal, check the flag.
 * 6. If the flag is still false, print "Element not found".
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Number of elements in the array.
 */

public class LinearSearchInArray {

    public static void main(String[] args) {

        int[] numbers = {10, 3, 56, 45, 50};

        int targetElement = 3;

        boolean isFound = false;

        for (int index = 0; index < numbers.length; index++) {

            if (targetElement == numbers[index]) {

                System.out.println("Element found at index " + index);

                isFound = true;
                break;
            }
        }

        if (!isFound) {

            System.out.println("Element not found in array");
        }
    }
}