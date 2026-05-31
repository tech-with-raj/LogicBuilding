package main.java.dsa;

/*
 * Problem Name: Reverse Characters of Each Word in a String
 *
 * Problem Statement:
 * Given a sentence, reverse the characters of each individual word
 * while maintaining the original order of the words.
 *
 * The positions of the words should remain unchanged.
 * Only the characters inside each word should be reversed.
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
 * The word order remains the same:
 *
 * This is Rajasekar
 * ↓
 * sihT si rakesajaR
 *
 * Approach:
 * 1. Split the input string into individual words.
 * 2. Traverse each word one by one.
 * 3. Convert the word into a character array.
 * 4. Use the two-pointer technique to reverse the characters.
 * 5. Convert the reversed character array back into a string.
 * 6. Append the reversed word to the result.
 * 7. Preserve spaces between words.
 * 8. Print the final transformed string.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Total number of characters in the input string.
 */

public class ReverseCharactersOfEachWordInString {

    public static void main(String[] args) {

        String input = "This is Rajasekar";

        String[] words = input.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            char[] characters = word.toCharArray();

            int leftPointer = 0;
            int rightPointer = characters.length - 1;

            while (leftPointer < rightPointer) {

                char temporaryCharacter = characters[leftPointer];
                characters[leftPointer] = characters[rightPointer];
                characters[rightPointer] = temporaryCharacter;

                leftPointer++;
                rightPointer--;
            }

            result.append(new String(characters))
                    .append(" ");
        }

        System.out.println(result.toString().trim());
    }
}