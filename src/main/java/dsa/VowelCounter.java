package main.java.dsa;

/*
 * Problem Name: Count Vowels in a String
 *
 * Problem Statement:
 * Given a string, count the total number of vowels present in it.
 *
 * Vowels are:
 * a, e, i, o, u (both uppercase and lowercase).
 *
 * Example:
 *
 * Input:
 * "Hello World"
 *
 * Output:
 * Vowels count in the String Hello World is 3
 *
 * Explanation:
 * The vowels present are:
 * e, o, o
 *
 * Total vowels = 3
 *
 * Approach:
 * 1. Store all vowels in a reference string.
 * 2. Traverse each character of the input string.
 * 3. Check whether the current character exists in the vowel string.
 * 4. If found, increment the vowel counter.
 * 5. After traversing the entire string, print the count.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Length of the input string.
 */

public class VowelCounter {

    public static void main(String[] args) {

        String input = "Hello Word";
        String vowels = "aeiouAEIOU";
        int count = 0;

        for (int index = 0; index < input.length(); index++) {

            if (vowels.indexOf(input.charAt(index)) != -1) {

                count++;
            }
        }

        System.out.println("Vowels count in the String " + input + " is " + count);
    }
}