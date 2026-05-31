package main.java.dsa;

/*
 * Problem Name: Count Characters Without Adjacent Whitespace
 *
 * Problem Statement:
 * Given a string, count the number of characters that do not have
 * a whitespace immediately before or immediately after them.
 *
 * Ignore whitespace characters themselves.
 *
 * A character is counted only if:
 * - The previous character is not a whitespace (or it is the first character).
 * - The next character is not a whitespace (or it is the last character).
 *
 * Example:
 *
 * Input:
 * " hello world raj me"
 *
 * Output:
 * The total number of Character without white space before and after it is 10
 *
 * Explanation:
 * The program skips whitespace characters and checks whether a character
 * has a space immediately before or after it.
 *
 * Characters located inside words satisfy the condition because they are
 * surrounded by non-space characters.
 *
 * Characters at word boundaries are excluded because they have a whitespace
 * either before or after them.
 *
 * Approach:
 * 1. Convert the string into a character array.
 * 2. Traverse each character in the array.
 * 3. Skip whitespace characters.
 * 4. Check whether the previous character is a whitespace.
 * 5. Check whether the next character is a whitespace.
 * 6. Count only those characters that have no adjacent whitespace.
 * 7. Print the final count.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Length of the input string.
 */

public class CountCharactersWithoutAdjacentWhitespace {

    public static void main(String[] args) {

        String input = " hello world raj me";

        char[] characters = input.toCharArray();

        int count = 0;

        for (int index = 0; index < characters.length; index++) {

            if (characters[index] == ' ') {

                continue;
            }

            boolean spaceBeforeCharacter =
                    (index > 0) && (characters[index - 1] == ' ');

            boolean spaceAfterCharacter =
                    (index < input.length() - 1) && (characters[index + 1] == ' ');

            if (!spaceBeforeCharacter && !spaceAfterCharacter) {

                count++;
            }
        }

        System.out.println(
                "The total number of Character without white space before and after it is "
                        + count
        );
    }
}