package main.java.dsa;

import java.util.HashMap;

/*
 * Problem Name: Find Frequency of Each Character in a String
 *
 * Problem Statement:
 * Given a string, count the frequency of each character and display
 * the result in the format:
 *
 * Character ---> Frequency
 *
 * The program should count all occurrences of every character present
 * in the string.
 *
 * Example:
 *
 * Input:
 * "rajasekar"
 *
 * Output:
 * r ---> 2
 * a ---> 3
 * j ---> 1
 * s ---> 1
 * e ---> 1
 * k ---> 1
 *
 * Explanation:
 * Character frequencies in the string:
 *
 * r = 2
 * a = 3
 * j = 1
 * s = 1
 * e = 1
 * k = 1
 *
 * A HashMap is used where:
 * - Key   = Character
 * - Value = Frequency Count
 *
 * Approach:
 * 1. Convert the input string into a character array.
 * 2. Create a HashMap to store character frequencies.
 * 3. Traverse each character in the array.
 * 4. Check whether the character already exists in the map.
 * 5. If present, increment its count.
 * 6. If not present, add it with a count of 1.
 * 7. Traverse the map and print each character along with its frequency.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(k)
 *
 * Where:
 * n = Length of the input string.
 * k = Number of unique characters in the string.
 */

public class CharacterFrequencyCounter {

    public static void main(String[] args) {

        String input = "rajasekar";

        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        char[] inputCharacters = input.toCharArray();

        for (char character : inputCharacters) {

            frequencyMap.put(
                    character,
                    frequencyMap.getOrDefault(character, 0) + 1
            );
        }

        for (char character : frequencyMap.keySet()) {

            System.out.println(character + " ---> " + frequencyMap.get(character));
        }
    }
}