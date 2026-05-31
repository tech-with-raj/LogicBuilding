package main.java.dsa;

import java.util.HashSet;
import java.util.Set;

/*
 * Problem Name: Check if a String is Pangram Using HashSet
 *
 * Problem Statement:
 * Given a sentence, determine whether it is a Pangram.
 *
 * A Pangram is a sentence that contains every letter of the English
 * alphabet (a to z) at least once.
 *
 * The sentence may contain spaces, numbers, punctuation marks,
 * or special characters, which should be ignored.
 *
 * Example:
 *
 * Input:
 * "The quick brown fox jumps over the lazy dog!!!"
 *
 * Output:
 * The quick brown fox jumps over the lazy dog!!! is a Pangram
 *
 * Explanation:
 * The sentence contains all 26 English alphabet letters.
 * Special characters and spaces are ignored.
 *
 * Approach:
 * 1. Convert the sentence to lowercase.
 * 2. Create a HashSet to store unique alphabet characters.
 * 3. Traverse each character in the sentence.
 * 4. Add only alphabetic characters into the HashSet.
 * 5. After traversal, check the size of the HashSet.
 * 6. If the size is 26, all letters are present and the sentence is a Pangram.
 * 7. Otherwise, it is not a Pangram.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(26) ≈ O(1)
 */

public class CheckIfTheStringIsPangramOrNotWithSet {

    public static void main(String[] args) {

        String statement = "The quick brown fox jumps over the lazy dog!!!";

        boolean result = checkPangram(statement);

        if (result) {

            System.out.println(statement + " is a Pangram");

        } else {

            System.out.println(statement + " is not a Pangram");
        }
    }

    public static boolean checkPangram(String sentence) {

        // Convert to lowercase
        sentence = sentence.toLowerCase();

        // Store unique alphabet characters
        Set<Character> letters = new HashSet<>();

        for (char c : sentence.toCharArray()) {

            if (Character.isAlphabetic(c)) {

                letters.add(c);
            }
        }

        return letters.size() == 26;
    }
}