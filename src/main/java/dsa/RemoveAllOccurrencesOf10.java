package main.java.dsa;

/*
 * Problem Name: Remove All Occurrences of Substring "10"
 *
 * Problem Statement:
 * Given a binary string consisting of only '0' and '1',
 * remove every occurrence of the substring "10".
 *
 * Whenever the substring "10" is formed, it should be removed
 * immediately and the process should continue on the remaining characters.
 *
 * Example:
 *
 * Input:
 * 10010101
 *
 * Output:
 * 01
 *
 * Explanation:
 * Process the string character by character:
 *
 * 10010101
 *
 * Remove first "10"
 * → 010101
 *
 * Remove next "10"
 * → 0101
 *
 * Remove next "10"
 * → 01
 *
 * Final Result:
 * 01
 *
 * Approach:
 * 1. Create a StringBuilder to store processed characters.
 * 2. Traverse the input string one character at a time.
 * 3. Append each character to the StringBuilder.
 * 4. After every append operation, check the last two characters.
 * 5. If they form the substring "10":
 *    - Remove both characters immediately.
 * 6. Continue processing the remaining characters.
 * 7. Print the final string after all removals.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Length of the input string.
 */

public class RemoveAllOccurrencesOf10 {

    public static void main(String[] args) {

        String input = "10010101";

        StringBuilder result = new StringBuilder();

        for (char character : input.toCharArray()) {

            result.append(character);

            int currentLength = result.length();

            // Check whether the last two characters form "10"
            if (currentLength >= 2
                    && result.charAt(currentLength - 2) == '1'
                    && result.charAt(currentLength - 1) == '0') {

                // Remove the substring "10"
                result.delete(currentLength - 2, currentLength);
            }
        }

        System.out.println("Final String : " + result);
    }
}