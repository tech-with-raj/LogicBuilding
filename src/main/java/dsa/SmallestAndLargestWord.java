package main.java.dsa;

/**
 * Problem:
 * Find the smallest and largest word in a given sentence.
 *
 * Example:
 * Input  : "I love java and python"
 * Output : I python
 *
 * Approach:
 * 1. Split the sentence into words using space delimiter
 * 2. Initialize smallest and largest with first word
 * 3. Traverse each word:
 *    - Update smallest if current word length is less
 *    - Update largest if current word length is greater
 * 4. Print result
 */
public class SmallestAndLargestWord {

    public static void main(String[] args) {

        String input = "I love java and python";

        // Split sentence into words
        String[] words = input.split(" ");

        // Initialize with first word
        String smallestWord = words[0];
        String largestWord = words[0];

        // Traverse words
        for (String word : words) {

            // Update smallest word
            if (word.length() < smallestWord.length()) {
                smallestWord = word;
            }

            // Update largest word
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }

        // Output result
        System.out.println("Smallest Word: " + smallestWord);
        System.out.println("Largest Word : " + largestWord);
    }
}