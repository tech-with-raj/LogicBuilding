package main.java.dsa;

/*
 * Problem Name: Count Uppercase and Lowercase Characters
 *
 * Problem Statement:
 * Given a string, count the number of uppercase and lowercase
 * alphabetic characters present in the string.
 *
 * Example:
 *
 * Input:
 * "aGskdSrikdkdSjkdSDGE"
 *
 * Output:
 * UpperCase count is 7
 * LowerCase count is 14
 *
 * Explanation:
 * Traverse each character in the string:
 * - If the character is uppercase, increment uppercaseCount.
 * - If the character is lowercase, increment lowercaseCount.
 *
 * Approach:
 * 1. Convert the string into a character array.
 * 2. Initialize uppercase and lowercase counters.
 * 3. Traverse each character in the array.
 * 4. Use Character.isUpperCase() to identify uppercase letters.
 * 5. Use Character.isLowerCase() to identify lowercase letters.
 * 6. Increment the respective counters.
 * 7. Print the final counts.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Length of the input string.
 */

public class CharacterCaseCounter {

    public static void main(String[] args) {

        String input = "aGskdSrikdkdSjkdSDGE";

        char[] inputArray = input.toCharArray();

        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for (char letter : inputArray) {

            if (Character.isUpperCase(letter)) {

                upperCaseCount++;

            } else if (Character.isLowerCase(letter)) {

                lowerCaseCount++;
            }
        }

        System.out.println("UpperCase count is " + upperCaseCount);
        System.out.println("LowerCase count is " + lowerCaseCount);
    }
}