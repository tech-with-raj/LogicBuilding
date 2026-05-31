package main.java.dsa;

import java.util.HashMap;
import java.util.Map;

/*
 * Problem Name: Find Second Most Repeated Character in a String
 *
 * Problem Statement:
 * Given a string, find the character that has the second highest frequency
 * of occurrence.
 *
 * If no second most repeated character exists, display an appropriate message.
 *
 * Example:
 *
 * Input:
 * "aabbbcccc"
 *
 * Output:
 * Second most repeated char is b
 *
 * Explanation:
 * Character Frequencies:
 *
 * a → 2
 * b → 3
 * c → 4
 *
 * Highest Frequency:
 * c → 4
 *
 * Second Highest Frequency:
 * b → 3
 *
 * Therefore, the second most repeated character is:
 * b
 *
 * Approach:
 * 1. Traverse the string and store character frequencies in a HashMap.
 * 2. Maintain two frequency variables:
 *    - firstMaxFrequency
 *    - secondMaxFrequency
 * 3. Traverse the frequency map.
 * 4. Identify the highest and second highest frequencies.
 * 5. Traverse the map again.
 * 6. Return the character whose frequency matches the second highest frequency.
 * 7. If no such character exists, return a blank character.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(k)
 *
 * Where:
 * n = Length of the input string.
 * k = Number of unique characters in the string.
 */

public class FindSecondMostRepeatedCharacter {

    public static void main(String[] args) {

        String input = "aabbbcccc";

        char result = findSecondMostRepeatedCharacter(input);

        if (result != ' ') {

            System.out.println(
                    "Second most repeated char is "
                            + result
            );

        } else {

            System.out.println(
                    "No second most repeated character found"
            );
        }
    }

    public static char findSecondMostRepeatedCharacter(String input) {

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char character : input.toCharArray()) {

            frequencyMap.put(
                    character,
                    frequencyMap.getOrDefault(character, 0) + 1
            );
        }

        int highestFrequency = 0;
        int secondHighestFrequency = 0;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {

            int currentFrequency = entry.getValue();

            if (currentFrequency > highestFrequency) {

                secondHighestFrequency = highestFrequency;

                highestFrequency = currentFrequency;

            } else if (currentFrequency > secondHighestFrequency
                    && currentFrequency < highestFrequency) {

                secondHighestFrequency = currentFrequency;
            }
        }

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {

            if (entry.getValue() == secondHighestFrequency) {

                return entry.getKey();
            }
        }

        return ' ';
    }
}