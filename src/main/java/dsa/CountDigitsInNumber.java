package main.java.dsa;

/*
 * Problem Name: Count Number of Digits in an Integer
 *
 * Problem Statement:
 * Given an integer, determine the total number of digits present in it.
 *
 * Demonstrate two approaches:
 * 1. Convert the number to a String and calculate its length.
 * 2. Use arithmetic operations to count digits without converting to a String.
 *
 * Example:
 *
 * Input:
 * Number = 1234
 *
 * Output:
 * Total number of digit in the given number is 4
 * Total number of digit in the given number is 4
 *
 * Explanation:
 * The number 1234 contains four digits:
 * 1, 2, 3, and 4
 *
 * Approach 1 (String Conversion):
 * - Convert the integer to a String.
 * - Find the length of the String.
 *
 * Approach 2 (Mathematical Approach):
 * - Repeatedly divide the number by 10.
 * - Increment a counter after each division.
 * - Continue until the number becomes 0.
 * - The counter represents the total number of digits.
 *
 * Approach:
 * 1. Convert the integer to a String and print its length.
 * 2. Initialize a counter variable.
 * 3. Extract digits one by one using the modulus (%) operator.
 * 4. Divide the number by 10 after each iteration.
 * 5. Increment the counter.
 * 6. Continue until the number becomes 0.
 * 7. Print the final count.
 *
 * Time Complexity: O(d)
 * Space Complexity: O(1)
 *
 * Where:
 * d = Number of digits in the given integer.
 */

public class CountDigitsInNumber {

    public static void main(String[] args) {

        int number = 1234;

        String numberAsString = Integer.toString(number);

        System.out.println(
                "Total number of digit in the given number is "
                        + numberAsString.length()
        );

        // Alternative solution using arithmetic operations
        int count = 0;
        int lastDigit;

        while (number != 0) {

            lastDigit = number % 10;

            count++;

            number = number / 10;
        }

        System.out.println(
                "Total number of digit in the given number is "
                        + count
        );
    }
}