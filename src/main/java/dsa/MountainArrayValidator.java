package main.java.dsa;

/*
 * Problem Name: Check Whether an Array is a Mountain Array
 *
 * Problem Statement:
 * Given an integer array, determine whether it is a Mountain Array.
 *
 * An array is considered a Mountain Array if:
 * 1. Its length is at least 3.
 * 2. Elements strictly increase up to a peak element.
 * 3. The peak element is neither the first nor the last element.
 * 4. Elements strictly decrease after the peak.
 *
 * Example:
 *
 * Input:
 * Array = [1, 3, 4, 5, 6, 4, 2, 1]
 *
 * Output:
 * This is a Mountain Array
 *
 * Explanation:
 * The array first increases:
 *
 * 1 < 3 < 4 < 5 < 6
 *
 * Then decreases:
 *
 * 6 > 4 > 2 > 1
 *
 * Since there is exactly one valid peak (6) and the array
 * strictly increases before it and strictly decreases after it,
 * the array satisfies the Mountain Array conditions.
 *
 * Approach:
 * 1. Check whether the array length is at least 3.
 * 2. Start from index 0 and move upward while elements are increasing.
 * 3. Stop when the peak is reached.
 * 4. Ensure the peak is not the first or last element.
 * 5. Continue traversing while elements are decreasing.
 * 6. If the traversal reaches the last index, the array is a Mountain Array.
 * 7. Otherwise, it is not a Mountain Array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Number of elements in the array.
 */

public class MountainArrayValidator {

    public static void main(String[] args) {

        int[] numbers = {1, 3, 4, 5, 6, 4, 2, 1};

        if (numbers.length < 3) {

            System.out.println("This is not a Mountain Array");
            return;
        }

        int index = 0;

        // Climb up to the peak
        while (index < numbers.length - 1
                && numbers[index] < numbers[index + 1]) {

            index++;
        }

        // Peak cannot be first or last element
        if (index == 0 || index == numbers.length - 1) {

            System.out.println("This is not a Mountain Array");
            return;
        }

        // Move down from the peak
        while (index < numbers.length - 1
                && numbers[index] > numbers[index + 1]) {

            index++;
        }

        if (index == numbers.length - 1) {

            System.out.println("This is a Mountain Array");

        } else {

            System.out.println("This is not a Mountain Array");
        }
    }
}