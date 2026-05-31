package main.java.dsa;

/*
 * Problem Name: Convert Integer to Roman Numeral
 *
 * Problem Statement:
 * Given an integer value, convert it into its Roman numeral representation.
 *
 * This implementation uses a greedy approach by repeatedly subtracting
 * the largest possible Roman numeral value and appending its corresponding
 * Roman symbol to the result.
 *
 * Note:
 * This program supports Roman numeral symbols:
 * L = 50
 * X = 10
 * V = 5
 * I = 1
 *
 * Example:
 *
 * Input:
 * 22
 *
 * Output:
 * Roman Number of Integer 22 is XXII
 *
 * Explanation:
 * 22 can be represented as:
 *
 * 10 + 10 + 1 + 1
 *
 * Roman equivalent:
 *
 * X + X + I + I = XXII
 *
 * The algorithm continuously subtracts the highest possible Roman value
 * until the number becomes zero.
 *
 * Approach:
 * 1. Store Roman symbols and their corresponding integer values in arrays.
 * 2. Traverse the integer values from largest to smallest.
 * 3. While the current number is greater than or equal to the Roman value:
 *    - Subtract the Roman value from the number.
 *    - Append the Roman symbol to the result.
 * 4. Continue until the number becomes zero.
 * 5. Print the generated Roman numeral.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Number of Roman symbols appended to the result.
 */

public class IntegerToRomanNumeralConverter {

    public static void main(String[] args) {

        int number = 22;
        int originalNumber = number;

        String[] romanSymbols = {"L", "X", "V", "I"};
        int[] romanValues = {50, 10, 5, 1};

        StringBuilder romanNumeral = new StringBuilder();

        for (int i = 0; i < romanValues.length; i++) {

            while (number >= romanValues[i]) {

                number = number - romanValues[i];
                romanNumeral.append(romanSymbols[i]);
            }
        }

        System.out.println(
                "Roman Number of Integer "
                        + originalNumber
                        + " is "
                        + romanNumeral
        );
    }
}