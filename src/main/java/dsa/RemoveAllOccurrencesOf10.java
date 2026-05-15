package main.java.dsa;/*
Problem:
Remove all occurrences of substring "10" from a binary string.

Example:
Input  : 10010101
Output : 01

Explanation:
Whenever substring "10" is found,
remove it immediately and continue processing.
*/

public class RemoveAllOccurrencesOf10 {

    public static void main(String[] args) {

        String input = "10010101";

        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {

            result.append(ch);

            int length = result.length();

            // Check whether last two characters form "10"
            if (length >= 2
                    && result.charAt(length - 2) == '1'
                    && result.charAt(length - 1) == '0') {

                // Remove substring "10"
                result.delete(length - 2, length);
            }
        }

        System.out.println("Final String : " + result);
    }
}