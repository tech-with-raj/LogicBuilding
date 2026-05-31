package main.java.dsa;

import java.math.BigInteger;

/*
 * Problem Name: Find Factorial of a Large Number
 *
 * Problem Statement:
 * Given a large positive integer, calculate its factorial.
 *
 * Since the factorial of large numbers can exceed the storage capacity
 * of primitive data types such as int and long, use BigInteger to store
 * and compute the result.
 *
 * Formula:
 * n! = n × (n - 1) × (n - 2) × ... × 2 × 1
 *
 * Example:
 *
 * Input:
 * 50
 *
 * Output:
 * 30414093201713378043612608166064768844377641568960512000000000000
 *
 * Explanation:
 * The factorial of 50 is an extremely large number that cannot be stored
 * in primitive numeric data types. BigInteger allows handling numbers of
 * arbitrary size.
 *
 * Approach:
 * 1. Initialize a BigInteger variable with value ONE.
 * 2. Iterate from 1 to the given number.
 * 3. Convert the loop variable to BigInteger.
 * 4. Multiply the current result by the loop value.
 * 5. Store the updated result.
 * 6. Print the final factorial value.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(k)
 *
 * Where:
 * n = Given number.
 * k = Number of digits in the factorial result.
 */

public class FactorialOfLargeNumber {

    public static void main(String[] args) {

        int number = 50;

        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= number; i++) {

            result = result.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Factorial of " + number + " is:");
        System.out.println(result);
    }
}