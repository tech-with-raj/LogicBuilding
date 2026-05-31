package main.java.dsa;

/*
 * Problem Name: Print Even Length Words from a String
 *
 * Problem Statement:
 * Given a sentence, print all words whose length is an even number.
 *
 * Example:
 *
 * Input:
 * "Hi this maharajahs from chennai you want to learn java if yes says okay to me"
 *
 * Output:
 * Hi
 * this
 * from
 * want
 * to
 * java
 * if
 * says
 * okay
 * to
 * me
 *
 * Explanation:
 * Each printed word contains an even number of characters.
 *
 * Approach:
 * 1. Remove leading and trailing spaces using trim().
 * 2. Split the sentence into individual words using space as the delimiter.
 * 3. Traverse each word in the resulting array.
 * 4. Check whether the word length is divisible by 2.
 * 5. If the length is even, print the word.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Total number of characters in the input string.
 */

public class EvenLengthWords {

    public static void main(String[] args) {

        String sentence = "Hi this maharajahs from chennai you want to learn java if yes says okay to me";

        String[] sentenceArray = sentence.trim().split(" ");

        for (String eachWord : sentenceArray) {

            if (eachWord.length() % 2 == 0) {

                System.out.println(eachWord);
            }
        }
    }
}