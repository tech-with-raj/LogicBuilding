package main.java.dsa;

/*
 * Problem Name: Find Sum of Array Elements
 *
 * Problem Statement:
 * Given an integer array, calculate the sum of all elements present in the array.
 *
 * Demonstrate two different approaches:
 * 1. Using a for-each loop.
 * 2. Using a traditional for loop with index traversal.
 *
 * Example:
 *
 * Input:
 * Array = [1, 45, 34, 53, 43]
 *
 * Output:
 * 176
 * 176
 *
 * Explanation:
 * Sum of all elements:
 *
 * 1 + 45 + 34 + 53 + 43 = 176
 *
 * The program calculates the same result using:
 * - Enhanced for-each loop
 * - Traditional indexed for loop
 *
 * Approach:
 * 1. Initialize a variable to store the sum.
 * 2. Traverse the array using a for-each loop and add each element to the sum.
 * 3. Print the calculated sum.
 * 4. Reset the sum variable.
 * 5. Traverse the array using a traditional for loop.
 * 6. Add each element to the sum.
 * 7. Print the final sum.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Number of elements in the array.
 */

public class FindSumOfArray {

    public static void main(String[] args) {

        int[] numbers = {1, 45, 34, 53, 43};

        int sumOfArray = 0;

        // Using for-each loop
        for (int number : numbers) {

            sumOfArray = sumOfArray + number;
        }

        System.out.println(sumOfArray);

        sumOfArray = 0;

        // Using traditional for loop
        for (int i = 0; i <= numbers.length - 1; i++) {

            sumOfArray = sumOfArray + numbers[i];
        }

        System.out.println(sumOfArray);
    }
}