package main.java.dsa;
import java.util.Arrays;
/*
========================================================
Problem: Minimum Character Replacements for No Adjacent Duplicates
========================================================

Problem Statement:
You are given a list of words. For each word, determine the minimum
number of character replacements required so that no two adjacent
characters are the same.

You may replace any character with any other character.

Return an array where each element represents the number of
replacements needed for that word.

--------------------------------------------------------
Example:
Input:
words = ["ab", "aab", "abb", "abab", "abaaaba"]

Output:
[0, 1, 1, 0, 1]

Explanation:
"ab"       -> already valid
"aab"      -> change one 'a'
"abb"      -> change one 'b'
"abab"     -> already valid
"abaaaba"  -> change middle 'a'
--------------------------------------------------------
*/

public class MinimumCharacterReplacementInAString {

    public static void main(String[] args) {

        String data[] = { "ab", "aab", "abb", "abab", "abaaaba" };

        int result[] = new int[data.length];

        for (int w = 0; w < data.length; w++) {

            String input = data[w];

            int count = 0;

            int index = 1;

            while (index < input.length()) {

                // If adjacent characters are same
                if (input.charAt(index) == input.charAt(index - 1)) {

                    count = count + 1;

                    // Skip next character after replacement
                    index = index + 2;

                } else {

                    index = index + 1;
                }
            }

            result[w] = count;
        }

        System.out.println(Arrays.toString(result));
    }
}