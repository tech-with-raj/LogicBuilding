package main.java.dsa;

/*
 * Problem Name: Monotonic Array
 *
 * Problem Statement:
 * Given an integer array, determine whether it is monotonic.
 *
 * An array is considered monotonic if it is either:
 * 1. Monotonically increasing:
 *    Every element is greater than or equal to the previous element.
 *
 * 2. Monotonically decreasing:
 *    Every element is less than or equal to the previous element.
 *
 * Example:
 *
 * Input:
 * [2, 3, 6, 8, 9]
 *
 * Output:
 * The given array is Monotonic
 *
 * Explanation:
 * Each element is greater than the previous element,
 * so the array is monotonically increasing.
 *
 * Approach:
 * 1. Assume the array is both increasing and decreasing.
 * 2. Traverse the array from index 1.
 * 3. If the current element is greater than the previous element,
 *    it cannot be decreasing.
 * 4. If the current element is less than the previous element,
 *    it cannot be increasing.
 * 5. After traversal:
 *    - If either increasing or decreasing is true,
 *      the array is monotonic.
 *    - Otherwise, it is not monotonic.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MonotonicArray {

    public static void main(String[] args) {

        int[] array = {2, 3, 6, 8, 9};

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < array.length; i++) {

            if (array[i - 1] < array[i]) {

                decreasing = false;

            } else if (array[i - 1] > array[i]) {

                increasing = false;
            }
        }

        if (increasing || decreasing) {

            System.out.println("The given array is Monotonic");

        } else {

            System.out.println("The given array is not Monotonic");
        }
    }
}