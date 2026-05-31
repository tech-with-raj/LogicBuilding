package main.java.dsa;

/*
 * Problem Name: Find Largest and Second Largest Digit in a String
 *
 * Problem Statement:
 * Given a string containing alphabets, digits, and special characters,
 * find the largest and second largest digit present in the string.
 *
 * Only numeric characters should be considered.
 *
 * Example:
 *
 * Input:
 * "abc1234"
 *
 * Output:
 * Largest number in the String is 4
 * Second largest number in the String is 3
 *
 * Explanation:
 * Digits present in the string:
 *
 * 1, 2, 3, 4
 *
 * Largest Digit:
 * 4
 *
 * Second Largest Digit:
 * 3
 *
 * Non-digit characters are ignored during processing.
 *
 * Approach:
 * 1. Traverse each character in the string.
 * 2. Check whether the character is a digit.
 * 3. Convert the digit character into its numeric value.
 * 4. Maintain two variables:
 *    - largestDigit
 *    - secondLargestDigit
 * 5. If the current digit is greater than the largest digit:
 *    - Move the current largest digit to second largest.
 *    - Update the largest digit.
 * 6. Otherwise, update the second largest digit if applicable.
 * 7. Print both the largest and second largest digits.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Length of the input string.
 */

public class FindSecondLargestDigitInString {

    public static void main(String[] args) {

        String input = "abc1234";

        char[] characters = input.toCharArray();

        int largestDigit = -1;
        int secondLargestDigit = -1;

        for (char character : characters) {

            if (Character.isDigit(character)) {

                int currentDigit = character - '0';

                if (currentDigit > largestDigit) {

                    secondLargestDigit = largestDigit;

                    largestDigit = currentDigit;

                } else if (currentDigit > secondLargestDigit
                        && currentDigit < largestDigit) {

                    secondLargestDigit = currentDigit;
                }
            }
        }

        System.out.println(
                "Largest number in the String is "
                        + largestDigit
        );

        System.out.println(
                "Second largest number in the String is "
                        + secondLargestDigit
        );
    }
}