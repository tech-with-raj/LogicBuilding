package main.java.dsa;

/*
 * Problem Name: Check if a Number is Palindrome Using String
 *
 * Problem Statement:
 * Given an integer number, determine whether it is a palindrome by
 * converting the number into a string.
 *
 * A palindrome number remains the same when its digits are reversed.
 *
 * Example:
 *
 * Input:
 * 1221
 *
 * Output:
 * 1221 is Palindrome
 *
 * Explanation:
 * Original String = "1221"
 * Reversed String = "1221"
 *
 * Since both strings are equal, the number is a palindrome.
 *
 * Approach:
 * 1. Convert the integer into a string.
 * 2. Create a StringBuilder using the string.
 * 3. Reverse the string using StringBuilder.reverse().
 * 4. Convert the reversed StringBuilder back to a string.
 * 5. Compare the original string with the reversed string.
 * 6. If both are equal, the number is a palindrome.
 * 7. Otherwise, it is not a palindrome.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class CheckIfNumberIsPalindromeOrNotUsingString {

    public static void main(String[] args) {

        int number = 1221;

        // Converting integer to string
        String numberInString = Integer.toString(number);

        // Alternative way to convert integer to string
        String numberInString2 = number + "";

        StringBuilder reverseOfStringBuilder = new StringBuilder(numberInString);

        String reversedNum = reverseOfStringBuilder.reverse().toString();

        if (numberInString.equals(reversedNum)) {

            System.out.println(number + " is Palindrome");

        } else {

            System.out.println(number + " is not Palindrome");
        }
    }
}