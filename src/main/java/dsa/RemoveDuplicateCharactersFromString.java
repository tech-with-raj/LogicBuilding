package main.java.dsa;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Problem Name: Remove Duplicate Characters from a String
 *
 * Problem Statement:
 * Given a string, remove all duplicate characters while preserving
 * the order of their first occurrence.
 *
 * The resulting string should contain only unique characters
 * in the same order in which they originally appeared.
 *
 * Example:
 *
 * Input:
 * "java"
 *
 * Output:
 * "jav"
 *
 * Explanation:
 * Character occurrences:
 *
 * j → First occurrence → Keep
 * a → First occurrence → Keep
 * v → First occurrence → Keep
 * a → Duplicate occurrence → Remove
 *
 * Result:
 * "jav"
 *
 * Example:
 *
 * Input:
 * "Rajasekar"
 *
 * Output:
 * "Rajsekr"
 *
 * Explanation:
 * Duplicate characters such as 'a' are removed while preserving
 * the insertion order of unique characters.
 *
 * Approach:
 * 1. Convert the input string into a character array.
 * 2. Create a LinkedHashSet to store unique characters.
 * 3. Traverse the character array.
 * 4. Add each character to the LinkedHashSet.
 * 5. Since LinkedHashSet preserves insertion order and ignores duplicates,
 *    only unique characters remain.
 * 6. Traverse the LinkedHashSet and build a new string.
 * 7. Print the final string without duplicate characters.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Length of the input string.
 */

public class RemoveDuplicateCharactersFromString {

    public static void main(String[] args) {

        String input = "Rajasekar";

        char[] characters = input.toCharArray();

        Set<Character> uniqueCharacters = new LinkedHashSet<>();

        for (char character : characters) {

            uniqueCharacters.add(character);
        }

        StringBuilder result = new StringBuilder();

        for (char character : uniqueCharacters) {

            result.append(character);
        }

        String finalString = result.toString();

        System.out.println(finalString);
    }
}