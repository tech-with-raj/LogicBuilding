package main.java.dsa;

/*
 * Problem Name: Replace Vowels with 'x' in a String
 *
 * Problem Statement:
 * Given a string, replace every vowel with the character 'x'.
 *
 * Both uppercase and lowercase vowels should be replaced.
 *
 * Vowels:
 * a, e, i, o, u
 * A, E, I, O, U
 *
 * Example:
 *
 * Input:
 * "Rajasekar"
 *
 * Output:
 * Rxjxsxkxr
 *
 * Explanation:
 * Original String:
 * Rajasekar
 *
 * Vowels Found:
 * a, a, e, a
 *
 * After Replacement:
 * Rxjxsxkxr
 *
 * All vowels are replaced with the character 'x',
 * while non-vowel characters remain unchanged.
 *
 * Approach:
 * 1. Convert the input string into a character array.
 * 2. Traverse each character in the array.
 * 3. Check whether the current character is a vowel.
 * 4. If it is a vowel:
 *    - Append 'x' to the result.
 * 5. Otherwise:
 *    - Append the original character.
 * 6. Build the final string using StringBuilder.
 * 7. Print the modified string.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Length of the input string.
 */

public class ReplaceVowelsWithXInString {

    public static void main(String[] args) {

        String input = "Rajasekar";

        char[] inputCharacters = input.toCharArray();

        StringBuilder modifiedString = new StringBuilder();

        for (char currentCharacter : inputCharacters) {

            if (isVowel(currentCharacter)) {

                modifiedString.append('x');

            } else {

                modifiedString.append(currentCharacter);
            }
        }

        System.out.println(modifiedString);
    }

    public static boolean isVowel(char currentCharacter) {

        return currentCharacter == 'a'
                || currentCharacter == 'e'
                || currentCharacter == 'i'
                || currentCharacter == 'o'
                || currentCharacter == 'u'
                || currentCharacter == 'A'
                || currentCharacter == 'E'
                || currentCharacter == 'I'
                || currentCharacter == 'O'
                || currentCharacter == 'U';
    }
}