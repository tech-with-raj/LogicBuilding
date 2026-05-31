package main.java.dsa;

/*
 * Problem Name: Reverse Character Case in a String
 *
 * Problem Statement:
 * Given a string, convert all uppercase letters to lowercase
 * and all lowercase letters to uppercase.
 *
 * Non-alphabetic characters such as spaces, digits, and special
 * characters should remain unchanged.
 *
 * Example:
 *
 * Input:
 * "Rajasekar K"
 *
 * Output:
 * "rAJASEKAR k"
 *
 * Explanation:
 * Character Conversion:
 *
 * R → r
 * a → A
 * j → J
 * a → A
 * s → S
 * e → E
 * k → K
 * a → A
 * r → R
 * (space remains unchanged)
 * K → k
 *
 * Result:
 * "rAJASEKAR k"
 *
 * Approach:
 * 1. Convert the input string into a character array.
 * 2. Traverse each character in the array.
 * 3. Check whether the character is uppercase.
 * 4. If uppercase, convert it to lowercase.
 * 5. If lowercase, convert it to uppercase.
 * 6. Leave non-alphabetic characters unchanged.
 * 7. Append the converted character to a StringBuilder.
 * 8. Print the final converted string.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Length of the input string.
 */

public class ReverseCaseInString {

    public static void main(String[] args) {

        String input = "Rajasekar K";

        char[] inputCharacters = input.toCharArray();

        StringBuilder result = new StringBuilder();

        for (char currentCharacter : inputCharacters) {

            if (Character.isUpperCase(currentCharacter)) {

                result.append(Character.toLowerCase(currentCharacter));

            } else if (Character.isLowerCase(currentCharacter)) {

                result.append(Character.toUpperCase(currentCharacter));

            } else {

                result.append(currentCharacter);
            }
        }

        System.out.print(result);
    }
}