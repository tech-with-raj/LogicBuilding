package main.java.dsa;

import java.util.Arrays;

/*
 * Problem Name: Check Anagram
 *
 * Problem Statement:
 * Given two strings, determine whether they are anagrams of each other.
 *
 * Two strings are considered anagrams if they contain the same characters
 * with the same frequency, regardless of the order of characters.
 *
 * The comparison should be case-insensitive.
 *
 * Example:
 *
 * Input:
 * String 1 = "Silent"
 * String 2 = "Listen"
 *
 * Output:
 * These Strings are anagram
 *
 * Explanation:
 * After converting both strings to lowercase and sorting their characters:
 *
 * silent -> eilnst
 * listen -> eilnst
 *
 * Since both sorted strings are identical, they are anagrams.
 *
 * Approach:
 * 1. Convert both strings to lowercase.
 * 2. Check if both strings have the same length.
 * 3. Convert strings into character arrays.
 * 4. Sort both character arrays.
 * 5. Compare the sorted arrays.
 * 6. If both arrays are equal, the strings are anagrams.
 * 7. Otherwise, they are not anagrams.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

public class CheckAnagram {

    public static void main(String[] args) {

        String str1 = "Silent";
        String str2 = "Listen";

        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();

        if (s1.length() == s2.length()) {

            char[] s1Array = s1.toCharArray();
            char[] s2Array = s2.toCharArray();

            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            if (Arrays.equals(s1Array, s2Array)) {

                System.out.println("These Strings are anagram");
            } else {

                System.out.println("These Strings are not anagram");
            }

        } else {

            System.out.println("These Strings are not anagram");
        }
    }
}