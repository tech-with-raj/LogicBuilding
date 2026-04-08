package main.java.dsa;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Problem:
 * Given a string, print only unique characters in the same order.
 *
 * Example:
 * Input  : "programming"
 * Output : "progamin"
 *
 * Approach:
 * 1. Use LinkedHashMap to maintain insertion order
 * 2. Store frequency of each character
 * 3. Iterate map and collect keys
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 */
public class UniqueCharactersInString {

    public static void main(String[] args) {

        String input = "programming";

        String result = getUniqueCharacters(input);

        System.out.println("Input  : " + input);
        System.out.println("Output : " + result);
    }

    public static String getUniqueCharacters(String input) {

        // Step 1: Maintain order using LinkedHashMap
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Step 2: Count frequency
        for (char ch : input.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 3: Collect unique characters (keys)
        StringBuilder result = new StringBuilder();

        for (char ch : map.keySet()) {
            result.append(ch);
        }

        return result.toString();
    }
}