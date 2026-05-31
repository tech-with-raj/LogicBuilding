package main.java.dsa;

import java.util.Arrays;

/*
 * Problem Name: Reverse Only Vowels in a String
 *
 * Problem Statement:
 * Given a string, reverse only the vowel characters while keeping
 * all non-vowel characters in their original positions.
 *
 * Vowels:
 * a, e, i, o, u
 * A, E, I, O, U
 *
 * Example:
 *
 * Input:
 * "Hello"
 *
 * Output:
 * [H, o, l, l, e]
 *
 * Equivalent String:
 * Holle
 *
 * Explanation:
 * Original String:
 * H e l l o
 *
 * Vowels:
 * e, o
 *
 * After Reversing Vowels:
 * H o l l e
 *
 * Non-vowel characters remain in their original positions.
 *
 * Example:
 *
 * Input:
 * "Rajasekar"
 *
 * Output:
 * Reversed vowels while consonants remain fixed.
 *
 * Approach:
 * 1. Convert the input string into a character array.
 * 2. Maintain a string containing all vowels.
 * 3. Initialize two pointers:
 *    - Left pointer at the beginning.
 *    - Right pointer at the end.
 * 4. Move the left pointer until a vowel is found.
 * 5. Move the right pointer until a vowel is found.
 * 6. Swap the vowels.
 * 7. Continue until both pointers meet.
 * 8. Print the modified character array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Length of the input string.
 */

public class ReverseOnlyVowelsInString {

    public static void main(String[] args) {

        String input = "Hello";

        char[] characters = input.toCharArray();

        String vowels = "aeiouAEIOU";

        int leftPointer = 0;
        int rightPointer = input.length() - 1;

        while (leftPointer < rightPointer) {

            if (vowels.indexOf(characters[leftPointer]) == -1) {

                leftPointer++;

            } else if (vowels.indexOf(characters[rightPointer]) == -1) {

                rightPointer--;

            } else {

                char temporaryCharacter = characters[leftPointer];
                characters[leftPointer] = characters[rightPointer];
                characters[rightPointer] = temporaryCharacter;

                leftPointer++;
                rightPointer--;
            }
        }

        System.out.println(Arrays.toString(characters));
    }
}