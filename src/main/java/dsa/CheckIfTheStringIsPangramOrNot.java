package main.java.dsa;

/*
 * Problem Name: Check if a String is Pangram
 *
 * Problem Statement:
 * Given a sentence, determine whether it is a Pangram.
 *
 * A Pangram is a sentence that contains every letter of the English
 * alphabet (a to z) at least once, regardless of case.
 *
 * Example:
 *
 * Input:
 * "The quick brown fox jumps over the lazy dog"
 *
 * Output:
 * The quick brown fox jumps over the lazy dog is a Pangram
 *
 * Explanation:
 * The sentence contains every letter from 'a' to 'z' at least once.
 *
 * Approach:
 * 1. Convert the sentence to lowercase.
 * 2. If the sentence length is less than 26, return false.
 * 3. Iterate through all characters from 'a' to 'z'.
 * 4. Check whether each character exists in the sentence using indexOf().
 * 5. If any character is missing, return false.
 * 6. If all characters are present, return true.
 *
 * Time Complexity: O(26 × n) ≈ O(n)
 * Space Complexity: O(1)
 */

public class CheckIfTheStringIsPangramOrNot {

    public static void main(String[] args) {

        String statement = "The quick brown fox jumps over the lazy dog";

        String statementLowerCase = statement.toLowerCase();

        boolean result = checkPangram(statementLowerCase);

        if (result) {

            System.out.println(statement + " is a Pangram");

        } else {

            System.out.println(statement + " is not a Pangram");
        }
    }

    public static boolean checkPangram(String sentence) {

        if (sentence.length() < 26) {

            return false;
        }

        for (char i = 'a'; i <= 'z'; i++) {

            if (sentence.indexOf(i) < 0) {

                return false;
            }
        }

        return true;
    }
}