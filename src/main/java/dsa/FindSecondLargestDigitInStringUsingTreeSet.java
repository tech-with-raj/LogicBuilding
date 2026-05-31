package main.java.dsa;

import java.util.TreeSet;

/*
 * Problem Name: Find Largest and Second Largest Digit in a String Using TreeSet
 *
 * Problem Statement:
 * Given a string containing alphabets, digits, and special characters,
 * find the largest and second largest unique digit present in the string.
 *
 * Only numeric characters should be considered.
 *
 * A TreeSet is used to:
 * - Automatically remove duplicate digits.
 * - Store digits in sorted order.
 *
 * Example:
 *
 * Input:
 * "abc1232"
 *
 * Output:
 * Largest number in the String is 3
 * Second largest number in the String is 2
 *
 * Explanation:
 * Digits present:
 *
 * 1, 2, 3, 2
 *
 * Unique Digits:
 *
 * [1, 2, 3]
 *
 * Largest Digit:
 * 3
 *
 * Second Largest Digit:
 * 2
 *
 * Since TreeSet maintains sorted unique values,
 * retrieving the largest and second largest elements becomes simple.
 *
 * Approach:
 * 1. Traverse each character in the string.
 * 2. Check whether the character is a digit.
 * 3. Convert the digit character into an integer.
 * 4. Add the digit to a TreeSet.
 * 5. Duplicate digits are automatically ignored.
 * 6. Retrieve the largest digit using last().
 * 7. Retrieve the second largest digit using lower().
 * 8. Print both values.
 *
 * Time Complexity: O(n log k)
 * Space Complexity: O(k)
 *
 * Where:
 * n = Length of the input string.
 * k = Number of unique digits in the string.
 */

public class FindSecondLargestDigitInStringUsingTreeSet {

    public static void main(String[] args) {

        String input = "abc1232";

        char[] characters = input.toCharArray();

        TreeSet<Integer> uniqueDigits = new TreeSet<>();

        for (char character : characters) {

            if (Character.isDigit(character)) {

                int currentDigit = character - '0';

                uniqueDigits.add(currentDigit);
            }
        }

        int largestDigit = uniqueDigits.last();
        int secondLargestDigit = uniqueDigits.lower(largestDigit);

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