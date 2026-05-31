package main.java.dsa;

import java.util.HashSet;
import java.util.Set;

/*
 * Problem Name: Count Vowels in a String Using HashSet
 *
 * Problem Statement:
 * Given a string, count the total number of vowels present in it
 * using a HashSet.
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
 * 1. Create a HashSet containing all uppercase and lowercase vowels.
 * 2. Traverse each character of the input string.
 * 3. Check whether the current character exists in the HashSet.
 * 4. If present, increment the vowel counter.
 * 5. After traversing the entire string, print the total count.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Length of the input string.
 *
 * Note:
 * Although a HashSet is used, the space remains constant because
 * the set always contains only 10 vowel characters.
 */

public class VowelCounterUsingSet {

    public static void main(String[] args) {

        String input = "Hello Word";
        int count = 0;

        Set<Character> vowelSet = new HashSet<>();

        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
        vowelSet.add('A');
        vowelSet.add('E');
        vowelSet.add('I');
        vowelSet.add('O');
        vowelSet.add('U');

        for (int index = 0; index < input.length(); index++) {

            if (vowelSet.contains(input.charAt(index))) {

                count++;
            }
        }

        System.out.println("Vowels count in the String " + input + " is " + count);
    }
}