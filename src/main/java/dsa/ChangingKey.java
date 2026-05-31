package main.java.dsa;

/*
 * Problem Name: Count Key Changes
 *
 * Problem Statement:
 * Given a string representing a sequence of key presses, determine the
 * number of times the pressed key changes from one character to another.
 *
 * The comparison should be case-insensitive, meaning uppercase and
 * lowercase versions of the same character are considered identical.
 *
 * Example:
 *
 * Input:
 * "abBc"
 *
 * Output:
 * The total number of keys changed is 2
 *
 * Explanation:
 * Convert input to lowercase:
 * "abbc"
 *
 * a -> b  (change count = 1)
 * b -> b  (no change)
 * b -> c  (change count = 2)
 *
 * Total changes = 2
 *
 * Approach:
 * 1. Convert the string to lowercase.
 * 2. Convert the string into a character array.
 * 3. Store the first character as the previous key.
 * 4. Traverse the remaining characters.
 * 5. Compare current key with previous key.
 * 6. If both are different, increment the counter.
 * 7. Update previous key.
 * 8. Print the final count.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class ChangingKey {

    public static void main(String[] args) {

        int count = 0;
        char lastKey;
        char currentKey;

        String input = "abBc";

        char[] inputArray = input.toLowerCase().toCharArray();

        lastKey = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {

            currentKey = inputArray[i];

            if (lastKey != currentKey) {
                count++;
            }

            lastKey = currentKey;
        }

        System.out.println("The total number of keys changed is " + count);
    }
}