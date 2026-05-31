package main.java.dsa;

/*
 * Problem Name: Find Factorial of a Number
 *
 * Problem Statement:
 * Given a positive integer, calculate its factorial.
 *
 * The factorial of a number n is the product of all positive integers
 * less than or equal to n.
 *
 * Formula:
 * n! = n × (n - 1) × (n - 2) × ... × 2 × 1
 *
 * Example:
 *
 * Input:
 * 5
 *
 * Output:
 * 120
 *
 * Explanation:
 * 5! = 5 × 4 × 3 × 2 × 1
 *    = 120
 *
 * Approach:
 * 1. Initialize the result variable to 1.
 * 2. Iterate from 1 to the given number.
 * 3. Multiply the current result by the loop variable.
 * 4. Store the updated value back in the result variable.
 * 5. After the loop completes, print the factorial.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Given number.
 */

public class FactorialOfNumber {

    public static void main(String[] args) {

        int number = 5;
        int result = 1;

        for (int i = 1; i <= number; i++) {

            result = result * i;
        }

        System.out.println("Factorial of " + number + " is " + result);
    }
}