package main.java.dsa;

/*
 * Problem Name: Separate Alphabets and Numbers from a String
 *
 * Problem Statement:
 * Given a string containing alphabets and numeric characters,
 * separate the alphabets and numbers into two different strings.
 *
 * Example:
 *
 * Input:
 * "Ra123j"
 *
 * Output:
 * Alphabets from String Ra123j are Raj
 * Number from String Ra123j is 123
 *
 * Explanation:
 * Input String:
 * Ra123j
 *
 * Alphabet Characters:
 * R, a, j
 *
 * Numeric Characters:
 * 1, 2, 3
 *
 * Result:
 * Alphabets → Raj
 * Numbers   → 123
 *
 * Non-alphabetic and non-numeric characters (if present) are ignored.
 *
 * Approach:
 * 1. Convert the input string into a character array.
 * 2. Create two StringBuilder objects:
 *    - One for alphabets.
 *    - One for numbers.
 * 3. Traverse each character in the array.
 * 4. If the character is a digit:
 *    - Append it to the number StringBuilder.
 * 5. If the character is an alphabet:
 *    - Append it to the alphabet StringBuilder.
 * 6. Print both extracted strings.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Length of the input string.
 */

public class SeparateAlphabetsAndNumbersFromString {

    public static void main(String[] args) {

        String input = "Ra123j";

        char[] characters = input.toCharArray();

        StringBuilder alphabets = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (char currentCharacter : characters) {

            if (Character.isDigit(currentCharacter)) {

                numbers.append(currentCharacter);

            } else if (Character.isAlphabetic(currentCharacter)) {

                alphabets.append(currentCharacter);
            }
        }

        System.out.println(
                "Alphabets from String "
                        + input
                        + " are "
                        + alphabets
        );

        System.out.println(
                "Number from String "
                        + input
                        + " is "
                        + numbers
        );
    }
}