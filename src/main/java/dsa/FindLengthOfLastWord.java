package main.java.dsa;

/*
 * Problem Name: Find Length of the Last Word in a String
 *
 * Problem Statement:
 * Given a string consisting of words and leading, trailing, or multiple
 * intermediate spaces, find the length of the last word present in the string.
 *
 * A word is defined as a sequence of non-space characters.
 *
 * Example:
 *
 * Input:
 * "   Hello    World! raj blast "
 *
 * Output:
 * blast
 * 5
 *
 * Explanation:
 * After removing leading and trailing spaces, the string becomes:
 *
 * "Hello    World! raj blast"
 *
 * Splitting the string by spaces gives multiple tokens.
 * The last word is:
 *
 * "blast"
 *
 * The length of "blast" is:
 *
 * 5
 *
 * Approach:
 * 1. Remove leading and trailing spaces using trim().
 * 2. Split the string into words using split(" ").
 * 3. Access the last element from the resulting array.
 * 4. Trim the last word if necessary.
 * 5. Print the last word.
 * 6. Print the length of the last word.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Length of the input string.
 */

public class FindLengthOfLastWord {

    public static void main(String[] args) {

        String input = "   Hello    World! raj blast ";

        String trimmedValue = input.trim();

        String[] words = trimmedValue.split(" ");

        String lastWord = words[words.length - 1].trim();

        System.out.println(lastWord);
        System.out.println(lastWord.length());
    }
}