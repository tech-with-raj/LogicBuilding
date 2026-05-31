package main.java.dsa;

/*
 * Problem Name: Swap Two Numbers Using XOR Operator
 *
 * Problem Statement:
 * Given two integer variables, swap their values without using
 * a temporary variable.
 *
 * The swapping should be performed using the XOR (^) bitwise operator.
 *
 * Example:
 *
 * Input:
 * a = 10
 * b = 20
 *
 * Output:
 * Value of a = 30
 * Value of b = 10
 * Value of a = 20
 *
 * Final Values:
 * a = 20
 * b = 10
 *
 * Explanation:
 * XOR Properties:
 *
 * A ^ A = 0
 * A ^ 0 = A
 * A ^ B ^ B = A
 *
 * Swapping Process:
 *
 * Step 1:
 * a = a ^ b
 * a = 10 ^ 20 = 30
 *
 * Step 2:
 * b = a ^ b
 * b = 30 ^ 20 = 10
 *
 * Step 3:
 * a = a ^ b
 * a = 30 ^ 10 = 20
 *
 * Final Result:
 * a = 20
 * b = 10
 *
 * Approach:
 * 1. Perform XOR between a and b and store the result in a.
 * 2. XOR the updated value of a with b and store the result in b.
 * 3. XOR the updated value of a with the updated value of b and store the result in a.
 * 4. The values are now swapped without using an extra variable.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 *
 * Where:
 * The algorithm uses only bitwise operations and constant memory.
 */

public class SwapTwoNumbersUsingXOR {

    public static void main(String[] args) {

        int firstNumber = 10;
        int secondNumber = 20;

        firstNumber = firstNumber ^ secondNumber;

        System.out.println("Value of a=" + firstNumber);

        secondNumber = firstNumber ^ secondNumber;

        System.out.println("Value of b=" + secondNumber);

        firstNumber = firstNumber ^ secondNumber;

        System.out.println("Value of a=" + firstNumber);
    }
}