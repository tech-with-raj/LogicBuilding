package main.java.dsa;

/*
 * Problem Name: Find Largest Element in an Array
 *
 * Problem Statement:
 * Given an integer array, find and print the largest element present in the array.
 *
 * Example:
 *
 * Input:
 * [10, 20, 30, 50, 60, 100]
 *
 * Output:
 * 100
 *
 * Explanation:
 * Among all elements in the array, 100 is the largest value.
 *
 * Approach:
 * 1. Assume the first element is the largest.
 * 2. Traverse the array element by element.
 * 3. Compare each element with the current largest value.
 * 4. If a larger element is found, update the largest value.
 * 5. After traversing the entire array, print the largest element.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Number of elements in the array.
 *
 * Note:
 * Initializing largest with input[0] makes the solution work
 * correctly even when the array contains negative numbers.
 */

public class LargestElementInArray {

    public static void main(String[] args) {

        int[] input = {10, 20, 30, 50, 60, 100};

        int largest = input[0];

        for (int number : input) {

            if (number > largest) {

                largest = number;
            }
        }

        System.out.println("Largest element in the array is " + largest);
    }
}