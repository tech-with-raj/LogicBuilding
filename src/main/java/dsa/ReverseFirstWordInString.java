package main.java.dsa;

/*
 * Problem Name: Reverse the First Word of a String
 *
 * Problem Statement:
 * Given a sentence, reverse only the first word while keeping
 * the remaining words unchanged.
 *
 * If the input string is null or empty, display an appropriate message.
 *
 * Example:
 *
 * Input:
 * "Hello world from Java"
 *
 * Output:
 * olleH world from Java
 *
 * Explanation:
 * Original Sentence:
 * Hello world from Java
 *
 * First Word:
 * Hello
 *
 * Reversed First Word:
 * olleH
 *
 * Remaining Part:
 * world from Java
 *
 * Final Result:
 * olleH world from Java
 *
 * Approach:
 * 1. Validate that the input string is not null or empty.
 * 2. Split the string into two parts:
 *    - First word
 *    - Remaining sentence
 * 3. Convert the first word into a character array.
 * 4. Reverse the character array using the two-pointer technique.
 * 5. Convert the reversed character array back into a string.
 * 6. Concatenate the reversed first word with the remaining sentence.
 * 7. Print the final result.
 *
 * Time Complexity: O(k)
 * Space Complexity: O(k)
 *
 * Where:
 * k = Length of the first word.
 */

public class ReverseFirstWordInString {

    public static void main(String[] args) {

        String input = "Hello world from Java";

        if (input == null || input.isEmpty()) {

            System.out.println("Cannot resolve the reverse first word");

        } else {

            String[] splitInput = input.split(" ", 2);

            char[] firstWordCharacters = splitInput[0].toCharArray();

            int leftPointer = 0;
            int rightPointer = firstWordCharacters.length - 1;

            while (leftPointer < rightPointer) {

                char temporaryCharacter = firstWordCharacters[leftPointer];
                firstWordCharacters[leftPointer] = firstWordCharacters[rightPointer];
                firstWordCharacters[rightPointer] = temporaryCharacter;

                leftPointer++;
                rightPointer--;
            }

            String reversedFirstWord = new String(firstWordCharacters);

            System.out.println(
                    reversedFirstWord + " " + splitInput[1]
            );
        }
    }
}