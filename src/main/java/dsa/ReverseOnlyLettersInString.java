package main.java.dsa;

/*
 * Problem Name: Reverse Only Letters in a String
 *
 * Problem Statement:
 * Given a string containing letters, digits, and special characters,
 * reverse only the alphabetic characters while keeping all non-letter
 * characters in their original positions.
 *
 * Example:
 *
 * Input:
 * "2ab3"
 *
 * Output:
 * "2ba3"
 *
 * Explanation:
 * Original String:
 * 2 a b 3
 *
 * Only letters are reversed:
 * a ↔ b
 *
 * Digits remain in their original positions:
 * 2 _ _ 3
 *
 * Final Result:
 * 2 b a 3
 *
 * Example:
 *
 * Input:
 * "a1b2c3"
 *
 * Output:
 * "c1b2a3"
 *
 * Explanation:
 * Only alphabetic characters are reversed.
 * Numbers remain fixed at their original indices.
 *
 * Approach:
 * 1. Convert the string into a character array.
 * 2. Initialize two pointers:
 *    - Left pointer at the beginning.
 *    - Right pointer at the end.
 * 3. Move the left pointer forward until a letter is found.
 * 4. Move the right pointer backward until a letter is found.
 * 5. Swap the letters.
 * 6. Continue until both pointers meet.
 * 7. Convert the character array back into a string.
 * 8. Print the result.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Length of the input string.
 */

public class ReverseOnlyLettersInString {

    public static void main(String[] args) {

        String input = "2ab3";

        char[] characters = input.toCharArray();

        int leftPointer = 0;
        int rightPointer = characters.length - 1;

        while (leftPointer < rightPointer) {

            if (!Character.isLetter(characters[leftPointer])) {

                leftPointer++;

            } else if (!Character.isLetter(characters[rightPointer])) {

                rightPointer--;

            } else {

                char temporaryCharacter = characters[leftPointer];
                characters[leftPointer] = characters[rightPointer];
                characters[rightPointer] = temporaryCharacter;

                leftPointer++;
                rightPointer--;
            }
        }

        System.out.println(new String(characters));
    }
}