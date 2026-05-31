package main.java.dsa;

import java.util.HashMap;
import java.util.Map;

/*
 * Problem Name: Word Frequency Counter
 *
 * Problem Statement:
 * Given a sentence, count the frequency of each word and display
 * the occurrence count of every unique word.
 *
 * Example:
 *
 * Input:
 * "Hello this is Raj Raj"
 *
 * Output:
 * Hello ----> 1
 * this ----> 1
 * is ----> 1
 * Raj ----> 2
 *
 * Explanation:
 * The word "Raj" appears twice, while all other words appear once.
 *
 * Approach:
 * 1. Split the sentence into individual words using space as a delimiter.
 * 2. Create a HashMap to store word frequencies.
 * 3. Traverse each word in the array.
 * 4. If the word already exists in the map, increment its count.
 * 5. Otherwise, insert the word with a count of 1.
 * 6. Traverse the map entries and print each word along with its frequency.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Number of words in the input string.
 */

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String input = "Hello this is Raj Raj";

        String[] wordArray = input.split(" ");

        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : wordArray) {

            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {

            System.out.println(entry.getKey() + " ----> " + entry.getValue());
        }
    }
}