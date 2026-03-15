package main.java.dsa;

/*
Problem: Remove Extra Spaces from a String

Description:
Given a string that may contain leading, trailing, or multiple spaces
between words, normalize the string so that:

1. Leading spaces are removed
2. Trailing spaces are removed
3. Multiple spaces between words are replaced with a single space

Example:
Input  : "   Hello    World   "
Output : "Hello World"

Approach:
1. Use trim() to remove leading and trailing spaces.
2. Use replaceAll("\\s+", " ") to replace multiple spaces with a single space.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class NormalizeSpaces {

    public static void main(String[] args) {

        String input = "   Hello    World   ";

        // Step 1: Remove leading and trailing spaces
        input = input.trim();

        // Step 2: Replace multiple spaces with single space
        input = input.replaceAll("\\s+", " ");

        System.out.println(input);
    }
}