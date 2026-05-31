package main.java.dsa;

/*
 * Problem Name: Reverse an Integer Number
 *
 * Problem Statement:
 * Given an integer, reverse its digits and print the resulting number.
 *
 * The reversal should be performed using mathematical operations
 * without converting the number into a String.
 *
 * Example:
 *
 * Input:
 * 2340
 *
 * Output:
 * Reversed Number is:432
 *
 * Explanation:
 * Original Number:
 * 2340
 *
 * Extract digits from right to left:
 *
 * 0 → 4 → 3 → 2
 *
 * Construct the reversed number:
 *
 * 0
 * 04
 * 043
 * 0432
 *
 * Final integer value:
 * 432
 *
 * Leading zeros are automatically removed when stored as an integer.
 *
 * Approach:
 * 1. Initialize a variable to store the reversed number.
 * 2. Extract the last digit using the modulus (%) operator.
 * 3. Append the digit to the reversed number.
 * 4. Remove the last digit from the original number using division (/).
 * 5. Continue until the number becomes zero.
 * 6. Print the reversed number.
 *
 * Overflow Handling:
 * Before appending a digit, overflow and underflow checks can be
 * performed to ensure the reversed value remains within the
 * Integer range.
 *
 * Time Complexity: O(d)
 * Space Complexity: O(1)
 *
 * Where:
 * d = Number of digits in the input number.
 */

public class ReverseIntegerNumber {

    public static void main(String[] args) {

        int number = 2340;

        int reversedNumber = 0;

        int lastDigit;

        while (number != 0) {

            lastDigit = number % 10;

            /*
             * Overflow Checks (Optional)
             *
             * if (reversedNumber > Integer.MAX_VALUE / 10
             *         || (reversedNumber == Integer.MAX_VALUE / 10
             *         && lastDigit > 7)) {
             *
             *     System.out.println(0);
             *     System.exit(0);
             * }
             *
             * if (reversedNumber < Integer.MIN_VALUE / 10
             *         || (reversedNumber == Integer.MIN_VALUE / 10
             *         && lastDigit < -8)) {
             *
             *     System.out.println(0);
             *     System.exit(0);
             * }
             */

            reversedNumber = (reversedNumber * 10) + lastDigit;

            number = number / 10;
        }

        System.out.println("Reversed Number is:" + reversedNumber);
    }
}