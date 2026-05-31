package main.java.dsa;

/*
 * Problem Name: Find Frequency of Characters Without Using HashMap
 *
 * Problem Statement:
 * Given a string, count the frequency of each character without using
 * a HashMap or any collection framework.
 *
 * The program uses an integer array to store the frequency of characters
 * based on their ASCII values.
 *
 * Example:
 *
 * Input:
 * "aabbeeiidkdekdl@iedk03kd"
 *
 * Sample Output:
 * @ --> 1
 * 0 --> 1
 * 3 --> 1
 * a --> 2
 * b --> 2
 * d --> 5
 * e --> 4
 * i --> 3
 * k --> 4
 * l --> 1
 *
 * Explanation:
 * Each character is treated as an ASCII value.
 *
 * For example:
 * - 'a' is mapped to ASCII 97
 * - 'b' is mapped to ASCII 98
 * - '@' is mapped to ASCII 64
 *
 * The frequency array stores the count of each character at its
 * corresponding ASCII index.
 *
 * Approach:
 * 1. Convert the input string into a character array.
 * 2. Create an integer array of size 256 to cover ASCII characters.
 * 3. Traverse each character in the string.
 * 4. Use the character's ASCII value as the array index.
 * 5. Increment the frequency count at that index.
 * 6. Traverse the frequency array.
 * 7. Print characters whose frequency is greater than zero.
 *
 * Time Complexity: O(n + 256)
 * Space Complexity: O(256)
 *
 * Where:
 * n = Length of the input string.
 */

public class CharacterFrequencyWithoutHashMap {

    public static void main(String[] args) {

        String input = "aabbeeiidkdekdl@iedk03kd";

        char[] inputCharacters = input.toCharArray();

        int[] frequencyArray = new int[256];

        // Count character frequencies
        for (char currentCharacter : inputCharacters) {

            frequencyArray[currentCharacter]++;
        }

        // Print character frequencies
        for (int i = 0; i < frequencyArray.length; i++) {

            if (frequencyArray[i] > 0) {

                System.out.println((char) i + " --> " + frequencyArray[i]);
            }
        }
    }
}