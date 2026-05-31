package main.java.dsa;

/*
 * Problem Name: Swap Two Numbers Using Arithmetic Operations
 *
 * Problem Statement:
 * Given two integer variables, swap their values without using
 * a temporary variable.
 *
 * This solution uses arithmetic operations (addition and subtraction)
 * to exchange the values.
 *
 * Example:
 *
 * Input:
 * a = 10
 * b = 20
 *
 * Output:
 * Value of a:20
 * Value of b:10
 *
 * Explanation:
 * Original Values:
 *
 * a = 10
 * b = 20
 *
 * Step 1:
 * a = a + b
 * a = 10 + 20 = 30
 *
 * Step 2:
 * b = a - b
 * b = 30 - 20 = 10
 *
 * Step 3:
 * a = a - b
 * a = 30 - 10 = 20
 *
 * Final Values:
 *
 * a = 20
 * b = 10
 *
 * Note:
 * This approach works correctly for normal integer values but may
 * cause integer overflow if the sum exceeds the integer range.
 *
 * Approach:
 * 1. Add both numbers and store the result in the first variable.
 * 2. Subtract the second variable from the first variable to obtain
 *    the original first value.
 * 3. Subtract the updated second variable from the first variable
 *    to obtain the original second value.
 * 4. Print the swapped values.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 *
 * Where:
 * The algorithm performs a constant number of arithmetic operations.
 */

public class SwapTwoNumbersUsingArithmeticOperations {

    public static void main(String[] args) {

        int firstNumber = 10;
        int secondNumber = 20;

        firstNumber = firstNumber + secondNumber;

        secondNumber = firstNumber - secondNumber;

        firstNumber = firstNumber - secondNumber;

        System.out.println("Value of a:" + firstNumber);
        System.out.println("Value of b:" + secondNumber);
    }
}