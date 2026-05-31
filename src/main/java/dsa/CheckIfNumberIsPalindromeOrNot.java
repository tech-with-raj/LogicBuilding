package main.java.dsa;

/*
 * Problem Name: Check if a Number is Palindrome
 *
 * Problem Statement:
 * Given an integer number, determine whether it is a palindrome.
 *
 * A palindrome number remains the same when its digits are reversed.
 *
 * Example:
 *
 * Input:
 * 121
 *
 * Output:
 * 121 is a Palindrome
 *
 * Explanation:
 * Reverse of 121 is 121.
 * Since the original number and reversed number are equal,
 * the number is a palindrome.
 *
 * Approach:
 * 1. Store the original number.
 * 2. Reverse the number digit by digit.
 * 3. Extract the last digit using modulus (%).
 * 4. Build the reversed number.
 * 5. Remove the last digit using division (/).
 * 6. Compare the reversed number with the original number.
 * 7. If both are equal, the number is a palindrome.
 * 8. Otherwise, it is not a palindrome.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class CheckIfNumberIsPalindromeOrNot {

    public static void main(String[] args) {

        int number = 121;
        int originalNumber = number;
        int reverse = 0;

        while (number != 0) {

            int lastDigit = number % 10;

            reverse = reverse * 10 + lastDigit;

            number = number / 10;
        }

        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is a Palindrome");
        } else {
            System.out.println(originalNumber + " is not a Palindrome");
        }
    }
}