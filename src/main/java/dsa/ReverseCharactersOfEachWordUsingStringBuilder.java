package main.java.dsa;

/*
 * Problem Name: Reverse Characters of Each Word in a String Using StringBuilder
 *
 * Problem Statement:
 * Given a sentence, reverse the characters of each individual word
 * while preserving the original order of the words.
 *
 * The solution should utilize the built-in reverse() method provided
 * by the StringBuilder class.
 *
 * Example:
 *
 * Input:
 * "This is Rajasekar"
 *
 * Output:
 * "sihT si rakesajaR"
 *
 * Explanation:
 * Original Words:
 * This
 * is
 * Rajasekar
 *
 * Reversed Words:
 * sihT
 * si
 * rakesajaR
 *
 * The sequence of words remains unchanged.
 * Only the characters within each word are reversed.
 *
 * Approach:
 * 1. Split the input sentence into words using space as the delimiter.
 * 2. Traverse each word in the array.
 * 3. Create a StringBuilder object for the current word.
 * 4. Use the reverse() method to reverse the characters.
 * 5. Append the reversed word to the result string.
 * 6. Add a space after each reversed word.
 * 7. Print the final transformed sentence.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Total number of characters in the input string.
 */

public class ReverseCharactersOfEachWordUsingStringBuilder {

    public static void main(String[] args) {

        String input = "This is Rajasekar";

        String[] words = input.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            StringBuilder reversedWord = new StringBuilder(word);

            result.append(reversedWord.reverse())
                    .append(" ");
        }

        System.out.println(result.toString().trim());
    }
}