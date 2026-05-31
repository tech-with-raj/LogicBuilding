package main.java.dsa;

import java.util.HashMap;

/*
 * Problem Name: Find Frequency of Special Characters in a String
 *
 * Problem Statement:
 * Given a string containing alphabets, digits, spaces, and special characters,
 * count the frequency of each special character present in the string.
 *
 * A special character is any character that is not:
 * - An uppercase letter (A-Z)
 * - A lowercase letter (a-z)
 * - A digit (0-9)
 * - A space character
 *
 * Example:
 *
 * Input:
 * "sien@%67&*(())"
 *
 * Output:
 * @ ---> 1
 * % ---> 1
 * & ---> 1
 * * ---> 1
 * ( ---> 2
 * ) ---> 2
 *
 * Explanation:
 * The string contains alphabets and digits which are ignored.
 *
 * Special characters identified:
 * @, %, &, *, (, )
 *
 * Their occurrences are counted using a HashMap where:
 * - Key   = Special Character
 * - Value = Frequency Count
 *
 * Approach:
 * 1. Convert the input string into a character array.
 * 2. Traverse each character in the array.
 * 3. Check whether the character is a special character.
 * 4. Ignore alphabets, digits, and spaces.
 * 5. Store and update the frequency using a HashMap.
 * 6. Traverse the HashMap and print the frequency of each special character.
 * 7. Print the complete HashMap representation.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(k)
 *
 * Where:
 * n = Length of the input string.
 * k = Number of unique special characters.
 */

public class SpecialCharacterFrequencyCounter {

    public static void main(String[] args) {

        String input = "sien@%67&*(())";

        char[] inputCharacters = input.toCharArray();

        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char character : inputCharacters) {

            if (!((character >= 'a' && character <= 'z')
                    || (character >= '0' && character <= '9')
                    || (character >= 'A' && character <= 'Z')
                    || (character == ' '))) {

                if (frequencyMap.containsKey(character)) {

                    frequencyMap.put(
                            character,
                            frequencyMap.get(character) + 1
                    );

                } else {

                    frequencyMap.put(character, 1);
                }
            }
        }

        for (char character : frequencyMap.keySet()) {

            System.out.println(character + " ---> " + frequencyMap.get(character));
        }

        System.out.println(frequencyMap);
    }
}