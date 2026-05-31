package main.java.dsa;

/*
 * Problem Name: Swap Two Numbers Using a Temporary Variable
 *
 * Problem Statement:
 * Given two integer variables, swap their values using a temporary variable.
 *
 * This is the most common and easiest approach for exchanging values
 * between two variables.
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
 * Store the value of a in a temporary variable.
 *
 * temp = 10
 *
 * Step 2:
 * Assign the value of b to a.
 *
 * a = 20
 *
 * Step 3:
 * Assign the value stored in temp to b.
 *
 * b = 10
 *
 * Final Values:
 *
 * a = 20
 * b = 10
 *
 * Approach:
 * 1. Create a temporary variable.
 * 2. Store the value of the first variable in the temporary variable.
 * 3. Assign the value of the second variable to the first variable.
 * 4. Assign the value stored in the temporary variable to the second variable.
 * 5. Print the swapped values.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 *
 * Where:
 * The algorithm performs a constant number of assignments.
 */

public class SwapTwoNumbersUsingTemporaryVariable {

    public static void main(String[] args) {

        int firstNumber = 10;
        int secondNumber = 20;

        int temporaryValue = firstNumber;

        firstNumber = secondNumber;

        secondNumber = temporaryValue;

        System.out.println("Value of a:" + firstNumber);
        System.out.println("Value of b:" + secondNumber);
    }
}