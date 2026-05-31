package main.java.dsa;

/*
 * Problem Name: Find First and Last Occurrence of a Character in a String
 *
 * Problem Statement:
 * Given a string and a target character, find the index of the first
 * occurrence and the last occurrence of the target character.
 *
 * If the character is not present in the string, display an appropriate
 * message indicating that the character does not exist.
 *
 * Example:
 *
 * Input:
 * String = "Hello World"
 * Target Character = 'o'
 *
 * Output:
 * First Occurrence index of o is 4
 * Last Occurrence index of o is 7
 *
 * Explanation:
 * The character 'o' appears twice in the string:
 *
 * Hello World
 *     ^  ^
 *     4  7
 *
 * Therefore:
 * - First occurrence index = 4
 * - Last occurrence index = 7
 *
 * Approach:
 * 1. Initialize variables to store first and last occurrence indices.
 * 2. Traverse the string from left to right.
 * 3. When the target character is found for the first time, store its index.
 * 4. Traverse the string from right to left.
 * 5. When the target character is found, store its index as the last occurrence.
 * 6. If the character is not found, display a message.
 * 7. Otherwise, print both indices.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Length of the input string.
 */

public class FindFirstAndLastOccurrenceOfCharacter {

    public static void main(String[] args) {

        String input = "Hello World";
        char targetCharacter = 'o';

        int firstOccurrenceIndex = -1;
        int lastOccurrenceIndex = -1;

        // Find first occurrence
        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == targetCharacter) {

                firstOccurrenceIndex = i;
                break;
            }
        }

        // Find last occurrence
        for (int i = input.length() - 1; i >= 0; i--) {

            if (input.charAt(i) == targetCharacter) {

                lastOccurrenceIndex = i;
                break;
            }
        }

        if (firstOccurrenceIndex < 0) {

            System.out.println("Targeted Character is not present");

        } else {

            System.out.println("First Occurrence index of "
                    + targetCharacter + " is " + firstOccurrenceIndex);

            System.out.println("Last Occurrence index of "
                    + targetCharacter + " is " + lastOccurrenceIndex);
        }
    }
}